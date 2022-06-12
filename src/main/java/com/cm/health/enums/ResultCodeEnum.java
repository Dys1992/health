package com.cm.health.enums;


/**
 * @author: chenmo
 * @date: 2021/5/17
 */
public enum ResultCodeEnum {
    /**
     * 请求成功
     */
    SUCCESS("success", 200),
    fail("fail", 1001);

    String msg;
    int code;

    ResultCodeEnum(String msg, int code) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }
}
