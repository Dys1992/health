package com.cm.health.service;

import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.response.BasicResponse;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
public interface BloodPressureService {

    BasicResponse insertBP(AddBPRequest request);
    BasicResponse searchBP(SearchBpRequest request);
}
