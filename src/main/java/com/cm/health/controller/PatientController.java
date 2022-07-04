package com.cm.health.controller;

import com.cm.health.controller.model.ComboItem;
import com.cm.health.controller.model.ResultMsg;
import com.cm.health.model.request.AddPatientRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.cm.health.model.request.UpdatePatientRequest;
import com.cm.health.model.response.PatientVO;
import com.cm.health.service.PatientService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@RestController
@RequestMapping("/api/health")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/patient/add")
    public ResultMsg<Boolean> add(@Valid @RequestBody AddPatientRequest request) {
        return ResultMsg.success(patientService.insert(request));
    }

    @PostMapping("/patient/update")
    public ResultMsg<Boolean> update(@Valid @RequestBody UpdatePatientRequest request) {
        return ResultMsg.success(patientService.update(request));
    }


    @PostMapping("/patient/list")
    public ResultMsg<PageInfo> pageList(@Valid @RequestBody SearchPatientRequest request) {
        return ResultMsg.success(patientService.pageList(request));
    }

    @PostMapping("/getPatients")
    public ResultMsg<List<ComboItem>> getPatients(@Valid @RequestBody SearchPatientRequest request) {
        List<PatientVO> patients = patientService.getAll();
        List<ComboItem> comboItems = new ArrayList<>();
        for (PatientVO patientVO : patients) {
            ComboItem comboItem = new ComboItem();
            comboItem.setValue(patientVO.getId());
            comboItem.setText(patientVO.getPatientName());
            comboItems.add(comboItem);
        }
        return ResultMsg.success(comboItems);
    }
}
