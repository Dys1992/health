package com.cm.health.controller;

import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.response.BasicResponse;
import com.cm.health.service.BloodPressureService;
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
public class BloodPressureController {

    @Autowired
    BloodPressureService bloodPressureService;

    @PostMapping("/addBp")
    public BasicResponse add(@Valid @RequestBody AddBPRequest request) {
        return bloodPressureService.insertBP(request);
    }

    @PostMapping("/searchBp")
    public BasicResponse add(@Valid @RequestBody SearchBpRequest request) {
        return bloodPressureService.searchBP(request);
    }
}
