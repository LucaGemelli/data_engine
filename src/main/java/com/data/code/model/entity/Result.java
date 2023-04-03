package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Result {
    @Id
    @Column(name = "RESULT_ID", nullable = false)
    private Long resultId;
    @Column(name = "RACE_ID")
    private Long raceId;
    @Column(name = "DRIVER_ID")
    private Long driverId;
    @Column(name = "CONSTRUCTOR_ID")
    private Long constructorId;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "GRID")
    private Long grid;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "POSITION_TEXT")
    private String positionText;
    @Column(name = "POSITION_ORDER")
    private Long positionOrder;
    @Column(name = "POINTS")
    private BigDecimal points;
    @Column(name = "LAPS")
    private Long laps;
    @Column(name = "TIME")
    private String time;
    @Column(name = "MILLISECONDS")
    private String milliseconds;
    @Column(name = "FASTEST_LAP")
    private String fastestLap;
    @Column(name = "RANK")
    private String rank;
    @Column(name = "FASTEST_LAP_TIME")
    private String fastestLapTime;
    @Column(name = "FASTEST_LAP_SPEED")
    private String fastestLapSpeed;
    @Column(name = "STATUS_ID")
    private Long statusId;
}
