package com.cm.health.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class SearchPatientResponse {
    private Long id;
    private String patientName;
    private int age;
    private int sex;
    private int height;
    private double weight;
}
