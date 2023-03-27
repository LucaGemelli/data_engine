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
    @Column(name = "result_id", nullable = false)
    private Long resultId;
    @Column(name = "race_id")
    private Long raceId;
    @Column(name = "driver_id")
    private Long driverId;
    @Column(name = "constructor_id")
    private Long constructorId;
    @Column(name = "number")
    private String number;
    @Column(name = "grid")
    private Long grid;
    @Column(name = "position")
    private String position;
    @Column(name = "position_text")
    private String positionText;
    @Column(name = "position_order")
    private Long positionOrder;
    @Column(name = "points")
    private BigDecimal points;
    @Column(name = "laps")
    private Long laps;
    @Column(name = "time")
    private String time;
    @Column(name = "milliseconds")
    private String milliseconds;
    @Column(name = "fastest_lap")
    private String fastestLap;
    @Column(name = "rank")
    private String rank;
    @Column(name = "fastest_lap_time")
    private String fastestLapTime;
    @Column(name = "fastest_lap_speed")
    private String fastestLapSpeed;
    @Column(name = "status_id")
    private Long statusId;
}
