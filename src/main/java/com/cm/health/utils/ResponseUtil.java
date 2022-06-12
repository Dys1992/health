package com.cm.health.utils;


import com.cm.health.enums.ResultCodeEnum;
import com.cm.health.model.response.BasicResponse;

/**
 * @author: chenmo
 * @date: 2021/5/17
 */
public class ResponseUtil {

    public static BasicResponse success(Object data) {
        BasicResponse response = new BasicResponse(ResultCodeEnum.SUCCESS);
        response.setData(data);
        return response;
    }

    public static BasicResponse fail(ResultCodeEnum type, Object data) {
        BasicResponse response = new BasicResponse(type);
        response.setData(data);
        return response;
    }
}
