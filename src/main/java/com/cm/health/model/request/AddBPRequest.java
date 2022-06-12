package com.cm.health.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class AddBPRequest {
    @NotNull
    private Long patientId;
    @NotNull
    private int diastolicPressure;
    @NotNull
    private int systolicPressure;
    @NotNull
    private int handType;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date measureTime;
}
