package com.data.code.service;

import com.data.code.mappers.PilotMapper;
import com.data.code.model.entity.Pilot;
import com.data.code.model.repository.PilotRepository;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import com.data.code.model.response.PilotSimpleResponse;
import com.data.code.model.response.ResultResponse;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
public record PilotService(PilotRepository pilotRepository, ResultService resultService,
                           PilotStandingsService pilotStandingsService, PilotMapper pilotMapper) {

    public List<PilotSimpleResponse> getPilotsWins() {
        return stream(pilotRepository.findAll().spliterator(), true)
                .filter((pilot -> pilotStandingsService.verifyHasWins(pilot.getDriverId())))
                .map((pilot -> pilotMapper.toPilotSimpleResponse(pilot, pilotStandingsService.getMostNumberOfWins(pilot.getDriverId()))))
                .collect(toList());
    }


    public PilotResponse getPilotWinsGap() {
        Stream<Pilot> pilots = stream(pilotRepository.findAll().spliterator(), false);
        List<ResultResponse> resultResponses = pilots.filter(pilot -> resultService.verifyHasTwoOrMoreWins(pilot.getDriverId()))
                .map(pilot -> resultService.getWinsGapPeriod(pilot.getDriverId()))
                .collect(toList());
        ResultResponse response = resultResponses.stream()
                .max(Comparator.comparingLong(ResultResponse::getTotalMonths))
                .get();
        return pilotMapper.toPilotResponse(pilotRepository.findById(response.getDriverId()).get(), response);
    }

    public List<PilotFullResponse> getPilotsAndConstructors(int number, int page) {
        // TODO - 10 pilotos que pilotaram pelo maior número de equipes, por ordem decrescente
//        return stream(pilotRepository.findAll().spliterator(), false).map(pilotMapper::toPilotFullResponse).collect(toList());
        return null;
    }

    public List<PilotResponse> getPilots(String season, String round) {
        //TODO - Todos os pilotos que participaram de uma determinada corrida de uma determinada etapa. Exemplo: pilotos que participaram da segunda etapa da temporada
//        return stream(pilotRepository.findAll().spliterator(), false)
//                .filter()
//                .map(pilotMapper::toPilotResponse)
//                .collect(toList());
        return null;
    }
}
