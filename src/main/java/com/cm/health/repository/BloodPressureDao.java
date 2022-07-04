package com.cm.health.repository;

import com.cm.health.model.entity.BloodPressureEntity;
import com.cm.health.model.request.SearchBpRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Mapper
public interface BloodPressureDao {
    boolean insert(BloodPressureEntity bloodPressure);

    List<BloodPressureEntity> pageList(SearchBpRequest request);
}
