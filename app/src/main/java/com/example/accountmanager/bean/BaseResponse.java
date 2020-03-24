package com.example.accountmanager.bean;

public class BaseResponse<T> {
    private T data;//业务数据
    private boolean success;//是否查询成功
    private String message;//返回消息

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
