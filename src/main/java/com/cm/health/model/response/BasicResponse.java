package com.cm.health.model.response;

import com.cm.health.enums.ResultCodeEnum;
import lombok.Data;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class BasicResponse {
    private int code;
    private String msg;
    private Object data;

    public BasicResponse(ResultCodeEnum type) {
        this.code = type.getCode();
        this.msg = type.getMsg();
    }
}
