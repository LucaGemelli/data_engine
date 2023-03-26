package com.data.code.resource;

import com.data.code.model.response.NationalityResponse;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import com.data.code.service.NationalityService;
import com.data.code.service.PilotService;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
@Api(tags = "Engine V1")
public class EngineResource implements EngineApi {

    private final PilotService pilotService;
    private final NationalityService nationalityService;

    public EngineResource(PilotService pilotService, NationalityService nationalityService) {
        this.pilotService = pilotService;
        this.nationalityService = nationalityService;
    }

    @Override
    public ResponseEntity<List<PilotResponse>> getPilotsWins() {
        return ok(pilotService.getPilotsWins());
    }

    @Override
    public ResponseEntity<PilotResponse> getPilotWinsGap() {
        return ok(pilotService.getPilotWinsGap());
    }

    @Override
    public ResponseEntity<List<PilotFullResponse>> getPilotsAndTeams(int number, int page) {
        return ok(pilotService.getPilotsAndConstructors(number, page));
    }

    @Override
    public ResponseEntity<List<NationalityResponse>> getNationalities() {
        return ok(nationalityService.getNationalities());
    }

    @Override
    public ResponseEntity<List<PilotResponse>> getPilots(String season, String round) {
        return ok(pilotService.getPilots(season, round));
    }

}
