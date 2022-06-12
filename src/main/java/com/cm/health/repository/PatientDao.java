package com.cm.health.repository;

import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.request.SearchPatientRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Mapper
public interface PatientDao {
    boolean insertPatient(PatientEntity patient);

    boolean updatePatient(PatientEntity patient);

    List<PatientEntity> searchPatientBP(SearchPatientRequest request);
}
