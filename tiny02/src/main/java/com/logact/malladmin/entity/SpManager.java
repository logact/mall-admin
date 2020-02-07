package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 管理员表(SpManager)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:38:17
 */
@SuppressWarnings("serial")
public class SpManager extends Model<SpManager> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer mgId;
    //名称
    private String mgName;
    //密码
    private String mgPwd;
    //注册时间
    private Integer mgTime;
    //角色id
    private Integer roleId;

    private String mgMobile;

    private String mgEmail;
    //1：表示启用 0:表示禁用
    private Integer mgState;


    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }

    public String getMgName() {
        return mgName;
    }

    public void setMgName(String mgName) {
        this.mgName = mgName;
    }

    public String getMgPwd() {
        return mgPwd;
    }

    public void setMgPwd(String mgPwd) {
        this.mgPwd = mgPwd;
    }

    public Integer getMgTime() {
        return mgTime;
    }

    public void setMgTime(Integer mgTime) {
        this.mgTime = mgTime;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getMgMobile() {
        return mgMobile;
    }

    public void setMgMobile(String mgMobile) {
        this.mgMobile = mgMobile;
    }

    public String getMgEmail() {
        return mgEmail;
    }

    public void setMgEmail(String mgEmail) {
        this.mgEmail = mgEmail;
    }

    public Integer getMgState() {
        return mgState;
    }

    public void setMgState(Integer mgState) {
        this.mgState = mgState;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.mgId;
    }
    }
