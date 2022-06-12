package com.cm.health.model.request;

import lombok.Data;

/**
 * @author: chenmo
 * @date: 2022/5/13
 */
@Data
public class SearchPatientRequest extends BasicSearchRequest {
    private String patientName;

}
