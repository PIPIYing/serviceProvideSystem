package com.ying.www.service_provide.module;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "`user`")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     * 个人简介
     */
    @TableField(value = "intro")
    private String intro;

    /**
     * 0-男 1-女
     */
    @TableField(value = "sex")
    private Integer sex;

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
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取个人简介
     *
     * @return intro - 个人简介
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置个人简介
     *
     * @param intro 个人简介
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * 获取0-男 1-女
     *
     * @return sex - 0-男 1-女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置0-男 1-女
     *
     * @param sex 0-男 1-女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }
}