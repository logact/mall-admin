package com.logact.malladmin.entity;

import java.sql.Date	;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SpReport2)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:46:16
 */
@SuppressWarnings("serial")
public class SpReport2 extends Model<SpReport2> {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String rp2Page;

    private Integer rp2Count;

    private Date	 rp2Date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp2Page() {
        return rp2Page;
    }

    public void setRp2Page(String rp2Page) {
        this.rp2Page = rp2Page;
    }

    public Integer getRp2Count() {
        return rp2Count;
    }

    public void setRp2Count(Integer rp2Count) {
        this.rp2Count = rp2Count;
    }

    public Date	 getRp2Date() {
        return rp2Date;
    }

    public void setRp2Date(Date	 rp2Date) {
        this.rp2Date = rp2Date;
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
