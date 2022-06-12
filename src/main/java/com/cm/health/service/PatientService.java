package com.cm.health.service;

import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.BasicResponse;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
public interface PatientService {

    BasicResponse insertPatient(AddPatientRequest request);
    BasicResponse updatePatient(UpdatePatientRequest request);
    BasicResponse searchPatient(SearchPatientRequest request);
}
