package com.data.code.model.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PilotResponse {
    private String driverId;
    private String givenName;
    private String familyName;
    private LocalDate dateOfBirth;
    private String nationality;
    private int wins;
    //TODO
    private int firstWin;
    private int lastWin;
    private String constructor;
}
