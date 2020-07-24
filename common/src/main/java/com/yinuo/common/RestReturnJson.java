package com.yinuo.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RestReturnJson{

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Integer status;

    private String msg;

    private Object data;

    @JsonIgnore
    private String ok;

    public static RestReturnJson build(Integer status, String msg, Object data) {
        return new RestReturnJson(status, msg, data);
    }

    public static RestReturnJson build(Integer status, String msg, Object data, String ok) {
        return new RestReturnJson(status, msg, data, ok);
    }

    public static RestReturnJson ok(Object data) {
        return new RestReturnJson(data);
    }

    public static RestReturnJson ok() {
        return new RestReturnJson(null);
    }

    public static RestReturnJson errorMsg(String msg) {
        return new RestReturnJson(500, msg, null);
    }

    public static RestReturnJson errorMap(Object data) {
        return new RestReturnJson(501, "error", data);
    }

    public static RestReturnJson errorTokenMsg(String msg) {
        return new RestReturnJson(502, msg, null);
    }

    public static RestReturnJson errorException(String msg) {
        return new RestReturnJson(555, msg, null);
    }

    public static RestReturnJson errorUserQQ(String msg) {
        return new RestReturnJson(556, msg, null);
    }

    public RestReturnJson() {

    }

    public RestReturnJson(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public RestReturnJson(Integer status, String msg, Object data, String ok) {
        this.status = status;
        this.msg = msg;
        this.data = data;
        this.ok = ok;
    }

    public RestReturnJson(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

}


