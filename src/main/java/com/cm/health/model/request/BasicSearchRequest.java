package com.cm.health.model.request;

import lombok.Data;

/**
 * @author: chenmo
 * @date: 2021/10/12
 */
@Data
public class BasicSearchRequest {
    public int page = 1;
    public int pageSize = 10;
}
