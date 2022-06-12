package com.cm.health.controller;

import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.BasicResponse;
import com.cm.health.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@RestController
@RequestMapping("/api/health")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/addPatient")
    public BasicResponse add(@Valid @RequestBody AddPatientRequest request) {
        return patientService.insertPatient(request);
    }

    @PostMapping("/updatePatient")
    public BasicResponse add(@Valid @RequestBody UpdatePatientRequest request) {
        return patientService.updatePatient(request);
    }


    @PostMapping("/searchPatient")
    public BasicResponse add(@Valid @RequestBody SearchPatientRequest request) {
        return patientService.searchPatient(request);
    }
}
