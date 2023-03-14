package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 上传文件对象 files
 *
 * @author ruoyi
 * @date 2023-03-14
 */
public class Files extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文件id */
    private Long id;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String fileName;

    /** 上传文件 */
    @Excel(name = "上传文件")
    private String uploadFilesName;

    /** 类型 */
    @Excel(name = "类型")
    private Integer type;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return fileName;
    }
    public void setUploadFilesName(String uploadFilesName)
    {
        this.uploadFilesName = uploadFilesName;
    }

    public String getUploadFilesName()
    {
        return uploadFilesName;
    }
    public void setType(Integer type)
    {
        this.type = type;
    }

    public Integer getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("fileName", getFileName())
                .append("uploadFilesName", getUploadFilesName())
                .append("type", getType())
                .toString();
    }
}
