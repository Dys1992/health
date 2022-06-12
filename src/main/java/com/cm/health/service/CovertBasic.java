package com.cm.health.service;

import com.cm.health.model.entity.BloodPressureEntity;
import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.AddPatientRequest;

import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.SearchBloodPressureResponse;
import com.cm.health.model.response.SearchPatientResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2021/10/12
 */
@Mapper(componentModel = "spring")
public interface CovertBasic {
    CovertBasic COVERT_BASIC = Mappers.getMapper(CovertBasic.class);

    /**
     * request转换为entity
     *
     * @param request request
     * @return
     */
    PatientEntity covertAddPatientToEntity(AddPatientRequest request);
    PatientEntity covertUpdatePatientToEntity(UpdatePatientRequest request);


    /**
     * request转换为entity
     *
     * @param request request
     * @return
     */
    BloodPressureEntity covertAddBPToEntity(AddBPRequest request);

    List<SearchBloodPressureResponse> covertAddBPToEntity(List<BloodPressureEntity> list);

    List<SearchPatientResponse> coverentityToResponse(List<PatientEntity> list);

}
