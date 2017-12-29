package com.trsoft.app.mvpapplication.http;

import com.google.gson.annotations.JsonAdapter;



/**
 * 接收Api返回值
 * Created by huangzhe on 2017/4/13.
 */
public class ApiResultBean<T>{

    private int code;//代码
    private String message;//信息
//    @JsonAdapter(ContentTypeAdapterFactory.class)
    T data;//内容可变

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
