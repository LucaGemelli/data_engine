package com.data.code.service;

import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PilotService {

    public List<PilotResponse> getPilotsWins() {
        // TODO 	- Pilotos que já venceram ao menos 1 corrida
        return new ArrayList<>();
    }


    public PilotResponse getPilotWinsGap() {
        // TODO - Piloto com a maior distância entre a primeira e a última vitória
        return null;
    }

    public List<PilotFullResponse> getPilotsAndConstructors(int number, int page) {
        // TODO - 10 pilotos que pilotaram pelo maior número de equipes, por ordem decrescente
        return new ArrayList<>();
    }

    public List<PilotResponse> getPilots(String season, String round) {
        //TODO - Todos os pilotos que participaram de uma determinada corrida de uma determinada etapa. Exemplo: pilotos que participaram da segunda etapa da temporada
        return new ArrayList<>();
    }
}
