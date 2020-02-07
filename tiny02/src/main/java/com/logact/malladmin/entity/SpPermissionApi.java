package com.logact.malladmin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (SpPermissionApi)表实体类
 *
 * @author makejava
 * @since 2020-02-06 14:43:41
 */
@SuppressWarnings("serial")
public class SpPermissionApi extends Model<SpPermissionApi> {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer psId;

    private String psApiService;

    private String psApiAction;

    private String psApiPath;

    private Integer psApiOrder;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsApiService() {
        return psApiService;
    }

    public void setPsApiService(String psApiService) {
        this.psApiService = psApiService;
    }

    public String getPsApiAction() {
        return psApiAction;
    }

    public void setPsApiAction(String psApiAction) {
        this.psApiAction = psApiAction;
    }

    public String getPsApiPath() {
        return psApiPath;
    }

    public void setPsApiPath(String psApiPath) {
        this.psApiPath = psApiPath;
    }

    public Integer getPsApiOrder() {
        return psApiOrder;
    }

    public void setPsApiOrder(Integer psApiOrder) {
        this.psApiOrder = psApiOrder;
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
