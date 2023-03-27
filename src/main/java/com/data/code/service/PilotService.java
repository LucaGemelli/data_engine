package com.data.code.service;

import com.data.code.mappers.PilotMapper;
import com.data.code.model.repository.PilotRepository;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
public class PilotService {

    private final PilotRepository pilotRepository;
    private final PilotMapper pilotMapper;

    public PilotService(PilotRepository pilotRepository, PilotMapper pilotMapper) {
        this.pilotRepository = pilotRepository;
        this.pilotMapper = pilotMapper;
    }

    public List<PilotResponse> getPilotsWins() {
        //TODO - Pilotos que já venceram ao menos 1 corrida
        return stream(pilotRepository.findAll().spliterator(), false).map(pilotMapper::toPilotResponse).collect(toList());
    }


    public PilotResponse getPilotWinsGap() {
        // TODO - Piloto com a maior distância entre a primeira e a última vitória
        return null;
    }

    public List<PilotFullResponse> getPilotsAndConstructors(int number, int page) {
        // TODO - 10 pilotos que pilotaram pelo maior número de equipes, por ordem decrescente
        return stream(pilotRepository.findAll().spliterator(), false).map(pilotMapper::toPilotFullResponse).collect(toList());
    }

    public List<PilotResponse> getPilots(String season, String round) {
        //TODO - Todos os pilotos que participaram de uma determinada corrida de uma determinada etapa. Exemplo: pilotos que participaram da segunda etapa da temporada
        return stream(pilotRepository.findAll().spliterator(), false).map(pilotMapper::toPilotResponse).collect(toList());
    }
}
