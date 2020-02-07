package com.logact.malladmin.unit;

import com.baomidou.mybatisplus.extension.enums.ApiErrorCode;

import java.io.Serializable;

/**
 * @author: logact
 * @date: Created in 2020/2/6 15:32
 * @description:
 */
public class R<T> implements Serializable {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    private Meta meta;

    private R(long status ,T data ,String msg){
        this.data=data;
        Meta meta=new Meta(status,msg);
        this.meta=meta;
    }

    public static <T> R<T> ok(T data,String failMsg,String succMsg) {
        String msg=succMsg;
        long status =200;
        System.out.println(data ==null+"sdfssssssf>>>>>>>>>>>>>>>>>>>>"+data+"fdsffffffff");
        if(data==null){
            msg=failMsg;
            status=400;
        }
        if (data instanceof Boolean && Boolean.FALSE.equals(data)) {
            msg=failMsg;
            status=400;
        }
        return new R(status,data, msg);
    }



}
