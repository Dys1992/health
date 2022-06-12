package com.cm.health.service.impl;

import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.BasicResponse;
import com.cm.health.model.response.SearchPatientResponse;
import com.cm.health.repository.PatientDao;
import com.cm.health.service.CovertBasic;
import com.cm.health.service.PatientService;
import com.cm.health.utils.ResponseUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientDao patientDao;

    @Override
    public BasicResponse insertPatient(AddPatientRequest request) {
        PatientEntity patient = CovertBasic.COVERT_BASIC.covertAddPatientToEntity(request);
        return ResponseUtil.success(patientDao.insertPatient(patient));
    }

    @Override
    public BasicResponse updatePatient(UpdatePatientRequest request) {
        PatientEntity patientEntity = CovertBasic.COVERT_BASIC.covertUpdatePatientToEntity(request);
        return ResponseUtil.success(patientDao.updatePatient(patientEntity));
    }

    @Override
    public BasicResponse searchPatient(SearchPatientRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<PatientEntity> list = patientDao.searchPatientBP(request);
        List<SearchPatientResponse> searchPatientResponseList = CovertBasic.COVERT_BASIC.coverentityToResponse(list);
        return ResponseUtil.success(new PageInfo<>(searchPatientResponseList));
    }
}
