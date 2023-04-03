package com.data.code.model.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ResultResponse {
    private Long driverId;
    private Long totalMonths;
    private LocalDate firstDate;
    private LocalDate lastDate;
}
