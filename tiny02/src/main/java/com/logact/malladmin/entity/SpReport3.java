package com.logact.malladmin.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SpReport3)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:46:33
 */
@SuppressWarnings("serial")
public class SpReport3 extends Model<SpReport3> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    //用户来源
    private String rp3Src;
    //数量
    private Integer rp3Count;

    private Date rp3Date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp3Src() {
        return rp3Src;
    }

    public void setRp3Src(String rp3Src) {
        this.rp3Src = rp3Src;
    }

    public Integer getRp3Count() {
        return rp3Count;
    }

    public void setRp3Count(Integer rp3Count) {
        this.rp3Count = rp3Count;
    }

    public Date getRp3Date() {
        return rp3Date;
    }

    public void setRp3Date(Date rp3Date) {
        this.rp3Date = rp3Date;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }
