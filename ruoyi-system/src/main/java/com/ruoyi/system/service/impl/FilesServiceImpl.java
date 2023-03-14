package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FilesMapper;
import com.ruoyi.system.domain.Files;
import com.ruoyi.system.service.IFilesService;

/**
 * 上传文件Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-14
 */
@Service
public class FilesServiceImpl implements IFilesService 
{
    @Autowired
    private FilesMapper filesMapper;

    /**
     * 查询上传文件
     * 
     * @param id 上传文件主键
     * @return 上传文件
     */
    @Override
    public Files selectFilesById(Long id)
    {
        return filesMapper.selectFilesById(id);
    }

    /**
     * 查询上传文件列表
     * 
     * @param files 上传文件
     * @return 上传文件
     */
    @Override
    public List<Files> selectFilesList(Files files)
    {
        return filesMapper.selectFilesList(files);
    }

    /**
     * 新增上传文件
     * 
     * @param files 上传文件
     * @return 结果
     */
    @Override
    public int insertFiles(Files files)
    {
        return filesMapper.insertFiles(files);
    }

    /**
     * 修改上传文件
     * 
     * @param files 上传文件
     * @return 结果
     */
    @Override
    public int updateFiles(Files files)
    {
        return filesMapper.updateFiles(files);
    }

    /**
     * 批量删除上传文件
     * 
     * @param ids 需要删除的上传文件主键
     * @return 结果
     */
    @Override
    public int deleteFilesByIds(Long[] ids)
    {
        return filesMapper.deleteFilesByIds(ids);
    }

    /**
     * 删除上传文件信息
     * 
     * @param id 上传文件主键
     * @return 结果
     */
    @Override
    public int deleteFilesById(Long id)
    {
        return filesMapper.deleteFilesById(id);
    }
}
