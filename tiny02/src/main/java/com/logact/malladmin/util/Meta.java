package com.logact.malladmin.util;

/**
 * @author: logact
 * @date: Created in 2020/2/6 16:52
 * @description:
 */
public class Meta {
    private  String msg;
    private  long status;


    public Meta(long status, String msg) {
        this.msg=msg;
        this.status=status;
    }
    public String getMsg(){
        return msg;
    }
    public long getStatus(){
        return status;
    }
    public void setMsg(String msg){
        this.msg=msg;
    }
    public void setStatus(long status){
        this.status=status;
    }
}
