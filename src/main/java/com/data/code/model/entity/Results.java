package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Results {
    @Id
    @Column(name = "resultId", nullable = false)
    private Long resultId;
    @Column(name = "raceId")
    private Long raceId;
    @Column(name = "driverId")
    private Long driverId;
    @Column(name = "number")
    private Long number;
    @Column(name = "grid")
    private Long grid;
    @Column(name = "position")
    private Long position;
    @Column(name = "positionText")
    private Long positionText;
    @Column(name = "positionOrder")
    private Long positionOrder;
    @Column(name = "points")
    private Long points;
    @Column(name = "laps")
    private Long laps;
    @Column(name = "time")
    private String time;
    @Column(name = "milliseconds")
    private String milliseconds;
    @Column(name = "fastestLap")
    private Long fastestLap;
    @Column(name = "rank")
    private Long rank;
    @Column(name = "fastestLapTime")
    private String fastestLapTime;
    @Column(name = "fastestLapSpeed")
    private String fastestLapSpeed;
    @Column(name = "statusId")
    private Long statusId;
}
