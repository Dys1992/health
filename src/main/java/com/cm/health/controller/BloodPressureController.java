package com.cm.health.controller;

import com.cm.health.controller.model.ResultMsg;
import com.cm.health.model.request.AddBPRequest;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.service.BloodPressureService;
import com.github.pagehelper.PageInfo;
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

    @PostMapping("/bp/add")
    public ResultMsg<Boolean> add(@Valid @RequestBody AddBPRequest request) {
        return ResultMsg.success(bloodPressureService.insert(request));
    }

    @PostMapping("/bp/list")
    public ResultMsg<PageInfo> add(@Valid @RequestBody SearchBpRequest request) {
        return ResultMsg.success(bloodPressureService.pageList(request));
    }
}
