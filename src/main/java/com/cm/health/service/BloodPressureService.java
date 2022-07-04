package com.cm.health.service;

import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.github.pagehelper.PageInfo;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
public interface BloodPressureService {
    /**
     * 写入
     *
     * @param request
     * @return
     */
    Boolean insert(AddBPRequest request);

    /**
     * 分页查询
     *
     * @param request
     * @return
     */
    PageInfo pageList(SearchBpRequest request);
}
