package com.data.code.model.entity;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pilot {
    @Id
    @Column(name = "DRIVER_ID", nullable = false)
    private Long driverId;
    @Column(name = "DRIVER_REF")
    private String driverRef;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "CODE")
    private String code;
    @Column(name = "FORENAME")
    private String forename;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "DOB")
    private String dob;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "URL")
    private String url;
}
