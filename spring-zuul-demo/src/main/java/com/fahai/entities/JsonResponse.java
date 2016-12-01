package com.fahai.entities;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhanghao on 16/9/30.
 */
public class JsonResponse {
    private int error;
    private String msg;
    private Object data;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
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

    public JsonResponse(int error, String msg, Object data) {
        this.error = error;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}

