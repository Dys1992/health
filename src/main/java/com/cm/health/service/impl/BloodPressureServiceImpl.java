package com.cm.health.service.impl;

import com.cm.health.model.entity.BloodPressureEntity;
import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.response.SearchBloodPressureVO;
import com.cm.health.repository.BloodPressureDao;
import com.cm.health.repository.PatientDao;
import com.cm.health.service.BloodPressureService;
import com.cm.health.service.CovertBasic;
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
public class BloodPressureServiceImpl implements BloodPressureService {

    @Autowired
    BloodPressureDao bloodPressureDao;

    @Autowired
    PatientDao patientDao;

    @Override
    public Boolean insert(AddBPRequest request) {
        BloodPressureEntity bloodPressure = CovertBasic.COVERT_BASIC.covertAddBPToEntity(request);
        return bloodPressureDao.insert(bloodPressure);
    }

    @Override
    public PageInfo pageList(SearchBpRequest request) {
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<BloodPressureEntity> bloodPressureEntityList = bloodPressureDao.pageList(request);
        List<SearchBloodPressureVO> searchBloodPressure = CovertBasic.COVERT_BASIC.covertAddBPToEntity(bloodPressureEntityList);
        return new PageInfo<>(searchBloodPressure);

    }
}
