package com.data.code.model.repository;

import com.data.code.model.entity.PilotStandings;
import com.data.code.model.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PilotStandingsRepository extends JpaRepository<PilotStandings, Long> {

    PilotStandings findByDriverIdGreaterThanAndWinsEquals(Long driverId, Long wins);
}
