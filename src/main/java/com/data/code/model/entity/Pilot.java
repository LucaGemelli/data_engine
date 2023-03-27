package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Pilot {
    @Id
    @Column(name = "driver_id")
    private Long driverId;
    @Column(name = "driver_ref")
    private String driverRef;
    @Column(name = "number")
    private String number;
    @Column(name = "code")
    private String code;
    @Column(name = "forename")
    private String forename;
    @Column(name = "surname")
    private String surname;
    @Column(name = "dob")
    private String dob;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "url")
    private String url;
}
