package com.cm.health.model.response;

import lombok.Data;


/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class SearchPatientVO {
    private Long id;
    private String patientName;
    private int age;
    private int sex;
    private int height;
    private double weight;
}
