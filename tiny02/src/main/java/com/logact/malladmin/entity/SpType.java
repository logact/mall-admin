package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 类型表(SpType)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:47:02
 */
@SuppressWarnings("serial")
public class SpType extends Model<SpType> {
    //主键id
    @TableId(type = IdType.AUTO)
    private Integer typeId;
    //类型名称
    private String typeName;
    //删除时间标志
    private Integer deleteTime;


    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
        return this.typeId;
    }
    }
