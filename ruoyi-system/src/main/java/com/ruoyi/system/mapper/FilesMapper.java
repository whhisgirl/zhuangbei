package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Files;

/**
 * 上传文件Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-14
 */
public interface FilesMapper 
{
    /**
     * 查询上传文件
     * 
     * @param id 上传文件主键
     * @return 上传文件
     */
    public Files selectFilesById(Long id);

    /**
     * 查询上传文件列表
     * 
     * @param files 上传文件
     * @return 上传文件集合
     */
    public List<Files> selectFilesList(Files files);

    /**
     * 新增上传文件
     * 
     * @param files 上传文件
     * @return 结果
     */
    public int insertFiles(Files files);

    /**
     * 修改上传文件
     * 
     * @param files 上传文件
     * @return 结果
     */
    public int updateFiles(Files files);

    /**
     * 删除上传文件
     * 
     * @param id 上传文件主键
     * @return 结果
     */
    public int deleteFilesById(Long id);

    /**
     * 批量删除上传文件
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFilesByIds(Long[] ids);
}
