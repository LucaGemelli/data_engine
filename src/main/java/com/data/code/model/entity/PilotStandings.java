package com.data.code.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Data
public class PilotStandings {
    @Id
    @Column(name = "DRIVER_STANDINGS_ID", nullable = false)
    private Long pilotStandingsId;
    @Column(name = "RACE_ID")
    private Long raceId;
    @Column(name = "DRIVER_ID")
    private Long driverId;
    @Column(name = "POINTS")
    private BigDecimal points;
    @Column(name = "POSITION")
    private Long position;
    @Column(name = "POSITION_TEXT")
    private String positionText;
    @Column(name = "WINS")
    private Long wins;
}
