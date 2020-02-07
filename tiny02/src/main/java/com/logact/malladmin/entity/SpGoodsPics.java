package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品-相册关联表(SpGoodsPics)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:37:58
 */
@SuppressWarnings("serial")
public class SpGoodsPics extends Model<SpGoodsPics> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer picsId;
    //商品id
    private Integer goodsId;
    //相册大图800*800
    private String picsBig;
    //相册中图350*350
    private String picsMid;
    //相册小图50*50
    private String picsSma;


    public Integer getPicsId() {
        return picsId;
    }

    public void setPicsId(Integer picsId) {
        this.picsId = picsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPicsBig() {
        return picsBig;
    }

    public void setPicsBig(String picsBig) {
        this.picsBig = picsBig;
    }

    public String getPicsMid() {
        return picsMid;
    }

    public void setPicsMid(String picsMid) {
        this.picsMid = picsMid;
    }

    public String getPicsSma() {
        return picsSma;
    }

    public void setPicsSma(String picsSma) {
        this.picsSma = picsSma;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.picsId;
    }
    }
