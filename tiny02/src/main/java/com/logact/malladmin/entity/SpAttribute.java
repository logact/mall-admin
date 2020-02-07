package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 属性表(SpAttribute)表实体类
 *
 * @author makejava
 * @since 2020-02-05 21:28:38
 */
@SuppressWarnings("serial")
public class SpAttribute extends Model<SpAttribute> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer attrId;
    //属性名称
    private String attrName;
    //外键，类型id
    private Integer catId;
    //only:输入框(唯一)  many:后台下拉列表/前台单选框
    private String attrSel;
    //manual:手工录入  list:从列表选择
    private String attrWrite;
    //可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔
    private String attrVals;
    //删除时间标志
    private Integer deleteTime;


    public Integer getAttrId() {
        return attrId;
    }

    public void setAttrId(Integer attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getAttrSel() {
        return attrSel;
    }

    public void setAttrSel(String attrSel) {
        this.attrSel = attrSel;
    }

    public String getAttrWrite() {
        return attrWrite;
    }

    public void setAttrWrite(String attrWrite) {
        this.attrWrite = attrWrite;
    }

    public String getAttrVals() {
        return attrVals;
    }

    public void setAttrVals(String attrVals) {
        this.attrVals = attrVals;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.attrId;
    }
    }
