package com.cm.health.service.impl;

import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.PatientVO;
import com.cm.health.model.response.SearchPatientVO;
import com.cm.health.repository.PatientDao;
import com.cm.health.service.CovertBasic;
import com.cm.health.service.PatientService;
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
    public Boolean insert(AddPatientRequest request) {
        PatientEntity patient = CovertBasic.COVERT_BASIC.covertAddPatientToEntity(request);
        return patientDao.insert(patient);
    }

    @Override
    public Boolean update(UpdatePatientRequest request) {
        PatientEntity patientEntity = CovertBasic.COVERT_BASIC.covertUpdatePatientToEntity(request);
        return patientDao.update(patientEntity);
    }

    @Override
    public PageInfo pageList(SearchPatientRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<PatientEntity> list = patientDao.pageList(request);
        List<SearchPatientVO> searchPatientVOList = CovertBasic.COVERT_BASIC.coverentityToResponse(list);
        return new PageInfo<>(searchPatientVOList);
    }

    @Override
    public List<PatientVO> getAll() {
        List<PatientEntity> list =   patientDao.getAll();
        return CovertBasic.COVERT_BASIC.patientEntityToVo(list);
    }
}
