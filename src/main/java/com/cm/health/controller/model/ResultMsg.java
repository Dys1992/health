package com.cm.health.controller.model;

import lombok.Data;

import java.io.Serializable;

/**
 * controller层返回结果对象
 *
 * @author: chenmo
 * @date: 2022/6/20
 */
@Data
public class ResultMsg<T> implements Serializable {

    /**
     * 是否成功
     */
    private boolean result = true;

    /**
     * 错误message
     */
    private String message;

    /***
     * 错误码
     */
    private String errorCode;

    /**
     * 返回对象
     */
    private T data;

    public ResultMsg() {
    }

    public ResultMsg(boolean result, String message, T obj) {
        this.result = result;
        this.message = message;
        this.data = obj;
    }

    /**
     * 成功
     *
     * @param <T>
     * @return
     */
    public static <T> ResultMsg<T> success() {
        return new ResultMsg<>(true, "success", null);
    }

    /**
     * 成功 返回data
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ResultMsg<T> success(T data) {
        return new ResultMsg<>(true, "success", data);
    }

    /**
     * 失败
     *
     * @param message
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> ResultMsg<T> failure(String message, String errorCode) {
        ResultMsg<T> resultMsg = new ResultMsg<>();
        resultMsg.setMessage(message);
        resultMsg.setErrorCode(errorCode);
        return resultMsg;
    }

}
