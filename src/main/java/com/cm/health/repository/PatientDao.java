package com.cm.health.repository;

import com.cm.health.model.entity.PatientEntity;
import com.cm.health.model.request.SearchBpRequest;
import com.cm.health.model.request.SearchPatientRequest;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Mapper
public interface PatientDao {
    /**
     * 写入
     *
     * @param patient
     * @return
     */
    boolean insert(PatientEntity patient);

    /**
     * 更新
     *
     * @param patient
     * @return
     */
    boolean update(PatientEntity patient);

    /**
     * 分页查询
     *
     * @param request
     * @return
     */
    Page<PatientEntity> pageList(SearchPatientRequest request);

    /**
     * 获取所有病人信息
     * @return
     */
    List<PatientEntity> getAll();
}
