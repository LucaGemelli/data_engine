package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Race {
    @Id
    @Column(name = "RACE_ID", nullable = false)
    private Long raceId;
    @Column(name = "YEAR_DATE")
    private String year;
    @Column(name = "ROUND")
    private String round;
    @Column(name = "CIRCUIT_ID")
    private Long circuitId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "date")
    private String date;
    @Column(name = "TIME")
    private String time;
    @Column(name = "URL")
    private String url;
    @Column(name = "FP1_DATE")
    private String fp1Date;
    @Column(name = "FP1_TIME")
    private String fp1Time;
    @Column(name = "FP2_DATE")
    private String fp2Date;
    @Column(name = "FP2_TIME")
    private String fp2Time;
    @Column(name = "FP3_DATE")
    private String fp3Date;
    @Column(name = "FP3_TIME")
    private String fp3Time;
    @Column(name = "QUALI_DATE")
    private String qualiDate;
    @Column(name = "QUALI_TIME")
    private String qualiTime;
    @Column(name = "SPRINT_DATE")
    private String sprintDate;
    @Column(name = "SPRINT_TIME")
    private String sprintTime;
}
