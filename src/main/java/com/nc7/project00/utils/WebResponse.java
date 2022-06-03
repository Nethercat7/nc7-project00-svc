package com.nc7.project00.utils;

public class WebResponse {
    private int code;
    private Object data;
    private String msg;

    public WebResponse(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public WebResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public WebResponse(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
