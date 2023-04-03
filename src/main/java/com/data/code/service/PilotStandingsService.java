package com.data.code.service;

import com.data.code.model.entity.PilotStandings;
import com.data.code.model.repository.PilotStandingsRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public record PilotStandingsService(PilotStandingsRepository pilotStandingsRepository) {

    public Boolean verifyHasWins(Long driverId) {
        return pilotStandingsRepository.findByDriverId(driverId).stream().anyMatch(standings -> standings.getWins() > 1);
    }

    public Long getMostNumberOfWins(Long driverId) {
        return pilotStandingsRepository.findByDriverId(driverId).stream().max(Comparator.comparingLong(PilotStandings::getWins)).get().getWins();
    }

    public void getWinsGaps() {

    }
}
