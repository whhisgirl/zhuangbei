package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 上传文件对象 files
 *
 * @author ruoyi
 * @date 2023-03-15
 */
public class Files extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文件id */
    private Long id;

    /** 文件名称 */
    @Excel(name = "文件名称")
    private String fileName;

    /** 上传文件（路径） */
    @Excel(name = "上传文件", readConverterExp = "路=径")
    private String uploadFilesName;

    /** 类型 */
    @Excel(name = "类型")
    private Integer type;

    /** 文件上传时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "文件上传时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date uploadTime;

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
    public void setUploadTime(Date uploadTime)
    {
        this.uploadTime = uploadTime;
    }

    public Date getUploadTime()
    {
        return uploadTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("fileName", getFileName())
                .append("uploadFilesName", getUploadFilesName())
                .append("type", getType())
                .append("uploadTime", getUploadTime())
                .toString();
    }
}
