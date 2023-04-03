package com.data.code.model.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PilotResponse extends PilotSimpleResponse{
    private LocalDate firstWin;
    private LocalDate lastWin;
    private String constructor;
}
