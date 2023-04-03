package com.data.code.model.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PilotSimpleResponse {
    private String driverId;
    private String givenName;
    private String familyName;
    private LocalDate dateOfBirth;
    private String nationality;
    private Long wins;
}
