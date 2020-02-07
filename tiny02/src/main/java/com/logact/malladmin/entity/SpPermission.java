package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 权限表(SpPermission)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:52:07
 */
@SuppressWarnings("serial")
public class SpPermission extends Model<SpPermission> {
    @TableId(type = IdType.AUTO)
    private Integer psId;
    //权限名称
    private String psName;
    //父id
    private Integer psPid;
    //控制器
    private String psC;
    //操作方法
    private String psA;
    //权限等级
    private String psLevel;


    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public Integer getPsPid() {
        return psPid;
    }

    public void setPsPid(Integer psPid) {
        this.psPid = psPid;
    }

    public String getPsC() {
        return psC;
    }

    public void setPsC(String psC) {
        this.psC = psC;
    }

    public String getPsA() {
        return psA;
    }

    public void setPsA(String psA) {
        this.psA = psA;
    }

    public String getPsLevel() {
        return psLevel;
    }

    public void setPsLevel(String psLevel) {
        this.psLevel = psLevel;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.psId;
    }
    }
