package com.data.code.service;

import com.data.code.model.entity.Race;
import com.data.code.model.repository.RaceRepository;
import org.springframework.stereotype.Service;

@Service
public record RaceService(RaceRepository raceRepository) {

    public Race getRace(Long raceId) {
        return raceRepository.findById(raceId).orElseThrow();
    }

}
