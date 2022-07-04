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
public class SearchBloodPressureVO {
    private Long patientId;
    private int diastolicPressure;
    private int systolicPressure;
    private int handType;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date measureTime;
}
