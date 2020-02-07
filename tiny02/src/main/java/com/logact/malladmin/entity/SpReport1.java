package com.logact.malladmin.entity;

import java.sql.Date	;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SpReport1)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:45:55
 */
@SuppressWarnings("serial")
public class SpReport1 extends Model<SpReport1> {
    @TableId(type = IdType.AUTO)
    private Integer id;
    //用户数
    private Integer rp1UserCount;
    //地区
    private String rp1Area;

    private Date	 rp1Date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRp1UserCount() {
        return rp1UserCount;
    }

    public void setRp1UserCount(Integer rp1UserCount) {
        this.rp1UserCount = rp1UserCount;
    }

    public String getRp1Area() {
        return rp1Area;
    }

    public void setRp1Area(String rp1Area) {
        this.rp1Area = rp1Area;
    }

    public Date	 getRp1Date() {
        return rp1Date;
    }

    public void setRp1Date(Date	 rp1Date) {
        this.rp1Date = rp1Date;
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
