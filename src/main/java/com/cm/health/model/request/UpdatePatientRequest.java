package com.cm.health.model.request;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class UpdatePatientRequest {
    private Long id;
    @NotBlank(message = "病人姓名不能为空")
    private String patientName;
    @NotNull(message = "年龄不能为空")
    @Min(value = 0, message = "年龄必须大于0")
    @Max(value = 250, message = "年龄必须小于150")
    private int age;
    @NotNull(message = "性别不能为空")
    @Min(value = 0, message = "性别为男或女")
    @Max(value = 1, message = "性别为男或女")
    private int sex;
    @NotNull(message = "身高不能为空")
    @Min(value = 0, message = "身高必须大于1")
    @Max(value = 250, message = "身高必须小于250")
    private int height;
    @NotNull
    private double weight;
}
