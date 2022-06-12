package com.cm.health.service.impl;

import com.cm.health.model.entity.BloodPressureEntity;
import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.response.BasicResponse;
import com.cm.health.model.response.SearchBloodPressureResponse;
import com.cm.health.repository.BloodPressureDao;
import com.cm.health.service.BloodPressureService;
import com.cm.health.service.CovertBasic;
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
public class BloodPressureServiceImpl implements BloodPressureService {

    @Autowired
    BloodPressureDao bloodPressureDao;

    @Override
    public BasicResponse insertBP(AddBPRequest request) {
        BloodPressureEntity bloodPressure = CovertBasic.COVERT_BASIC.covertAddBPToEntity(request);
        return ResponseUtil.success(bloodPressureDao.insertBP(bloodPressure));
    }

    @Override
    public BasicResponse searchBP(SearchBpRequest request) {
        System.out.println(request.toString());
        PageHelper.startPage(request.getPage(), request.getPageSize());
        List<BloodPressureEntity> bloodPressureEntityList = bloodPressureDao.searchBP(request);
        List<SearchBloodPressureResponse> searchBloodPressure = CovertBasic.COVERT_BASIC.covertAddBPToEntity(bloodPressureEntityList);
        PageInfo p = new PageInfo<>(searchBloodPressure);
        return ResponseUtil.success(p);
    }
}
