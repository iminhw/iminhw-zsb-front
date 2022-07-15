package com.minhw.common.utils;


/**
 * 响应数据(结果)最外层对象
 * @author minhw
 */
public class ResultVo<T> {

    /** 状态码 */
    private Integer status;

    /** 提示信息 */
    private String message;

    /** 响应数据 */
    private T data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
