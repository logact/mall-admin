package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品-属性关联表(SpGoodsAttr)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:32:00
 */
@SuppressWarnings("serial")
public class SpGoodsAttr extends Model<SpGoodsAttr> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer id;
    //商品id
    private Integer goodsId;
    //属性id
    private Integer attrId;
    //商品对应属性的值
    private String attrValue;
    //该属性需要额外增加的价钱
    private Double addPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(Double addPrice) {
        this.addPrice = addPrice;
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
