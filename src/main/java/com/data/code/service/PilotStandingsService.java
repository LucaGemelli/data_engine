package com.data.code.service;

import com.data.code.model.entity.PilotStandings;
import com.data.code.model.repository.PilotStandingsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Optional.ofNullable;

@Service
public record PilotStandingsService(PilotStandingsRepository pilotStandingsRepository) {

    public Optional<PilotStandings> findWin(Long driverId) {
        return ofNullable(pilotStandingsRepository.findByDriverIdGreaterThanAndWinsEquals(driverId, 1L));
    }
}
