package com.cm.health.repository;

import com.cm.health.model.entity.BloodPressureEntity;
import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.response.SearchBloodPressureResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Mapper
public interface BloodPressureDao {
    boolean insertBP(BloodPressureEntity bloodPressure);

    List<BloodPressureEntity> searchBP(SearchBpRequest request);
}
