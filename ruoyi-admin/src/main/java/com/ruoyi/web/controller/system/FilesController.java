package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Files;
import com.ruoyi.system.service.IFilesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文件Controller
 *
 * @author ruoyi
 * @date 2023-03-14
 */
@RestController
@RequestMapping("/system/files")
public class FilesController extends BaseController
{
    @Autowired
    private IFilesService filesService;

    /**
     * 查询文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:files:list')")
    @GetMapping("/list")
    public TableDataInfo list(Files files)
    {
        startPage();
        List<Files> list = filesService.selectFilesList(files);
        return getDataTable(list);
    }

    /**
     * 导出文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:files:export')")
    @Log(title = "文件", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Files files)
    {
        List<Files> list = filesService.selectFilesList(files);
        ExcelUtil<Files> util = new ExcelUtil<Files>(Files.class);
        util.exportExcel(response, list, "文件数据");
    }

    /**
     * 获取文件详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:files:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(filesService.selectFilesById(id));
    }

    /**
     * 新增文件
     */
    @PreAuthorize("@ss.hasPermi('system:files:add')")
    @Log(title = "文件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Files files)
    {
        return toAjax(filesService.insertFiles(files));
    }

    /**
     * 修改文件
     */
    @PreAuthorize("@ss.hasPermi('system:files:edit')")
    @Log(title = "文件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Files files)
    {
        return toAjax(filesService.updateFiles(files));
    }

    /**
     * 删除文件
     */
    @PreAuthorize("@ss.hasPermi('system:files:remove')")
    @Log(title = "文件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(filesService.deleteFilesByIds(ids));
    }
}
