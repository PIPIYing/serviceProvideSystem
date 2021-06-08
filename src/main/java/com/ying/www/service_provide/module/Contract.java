package com.ying.www.service_provide.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;
import java.util.Date;

@TableName(value = "contract")
public class Contract {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "project_id")
    private Integer projectId;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "content")
    private String content;

    @TableField(value = "start_time")
    private LocalDateTime startTime;

    @TableField(value = "valid_time")
    private LocalDateTime validTime;

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
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
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
     * @return valid_time
     */
    public LocalDateTime getValidTime() {
        return validTime;
    }

    /**
     * @param validTime
     */
    public void setValidTime(LocalDateTime validTime) {
        this.validTime = validTime;
    }
}