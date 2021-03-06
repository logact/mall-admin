package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品表(SpGoods)表实体类
 *
 * @author makejava
 * @since 2020-02-05 21:39:40
 */
@SuppressWarnings("serial")
public class SpGoods extends Model<SpGoods> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer goodsId;
    //商品名称
    private String goodsName;
    //商品价格
    private Double goodsPrice;
    //商品数量
    private Integer goodsNumber;
    //商品重量
    private Integer goodsWeight;
    //类型id
    private Integer catId;
    //商品详情介绍
    private String goodsIntroduce;
    //图片logo大图
    private String goodsBigLogo;
    //图片logo小图
    private String goodsSmallLogo;
    //0:正常  1:删除
    private Integer isDel;
    //添加商品时间
    private Integer addTime;
    //修改商品时间
    private Integer updTime;
    //软删除标志字段
    private Integer deleteTime;
    //一级分类id
    private Integer catOneId;
    //二级分类id
    private Integer catTwoId;
    //三级分类id
    private Integer catThreeId;
    //热卖数量
    private Integer hotMumber;
    //是否促销
    private Integer isPromote;
    //商品状态 0: 未通过 1: 审核中 2: 已审核
    private Integer goodsState;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Integer getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Integer goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    public String getGoodsBigLogo() {
        return goodsBigLogo;
    }

    public void setGoodsBigLogo(String goodsBigLogo) {
        this.goodsBigLogo = goodsBigLogo;
    }

    public String getGoodsSmallLogo() {
        return goodsSmallLogo;
    }

    public void setGoodsSmallLogo(String goodsSmallLogo) {
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Integer updTime) {
        this.updTime = updTime;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getCatOneId() {
        return catOneId;
    }

    public void setCatOneId(Integer catOneId) {
        this.catOneId = catOneId;
    }

    public Integer getCatTwoId() {
        return catTwoId;
    }

    public void setCatTwoId(Integer catTwoId) {
        this.catTwoId = catTwoId;
    }

    public Integer getCatThreeId() {
        return catThreeId;
    }

    public void setCatThreeId(Integer catThreeId) {
        this.catThreeId = catThreeId;
    }

    public Integer getHotMumber() {
        return hotMumber;
    }

    public void setHotMumber(Integer hotMumber) {
        this.hotMumber = hotMumber;
    }

    public Integer getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Integer isPromote) {
        this.isPromote = isPromote;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.goodsId;
    }
    }
