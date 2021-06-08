package com.ying.www.service_provide.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

@TableName(value = "project")
public class Project {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "project_name")
    private String projectName;

    @TableField(value = "content")
    private String content;

    @TableField(value = "start_time")
    private LocalDateTime startTime;

    @TableField(value = "end_time")
    private LocalDateTime endTime;

    @TableField(value = "status")
    private Integer status;

    @TableField(value = "principal")
    private Integer principal;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return project_name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return start_time
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return principal
     */
    public Integer getPrincipal() {
        return principal;
    }

    /**
     * @param principal
     */
    public void setPrincipal(Integer principal) {
        this.principal = principal;
    }
}