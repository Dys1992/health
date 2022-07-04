package com.cm.health.service;

import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.PatientVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
public interface PatientService {

    /**
     * 添加病人
     *
     * @param request
     * @return
     */
    Boolean insert(AddPatientRequest request);

    /**
     * 更新病人信息
     *
     * @param request
     * @return
     */
    Boolean update(UpdatePatientRequest request);

    /**
     * 分页查询
     *
     * @param request
     * @return
     */
    PageInfo pageList(SearchPatientRequest request);

    /**
     * 获取所有的病人
     *
     * @return
     */
    List<PatientVO> getAll();

}
