package com.data.code.resource;

import com.data.code.model.response.NationalityResponse;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import com.data.code.model.response.PilotSimpleResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Engine V1")
@RequestMapping("/api/engine/v1")
public interface EngineApi {

    @ApiOperation(
            value = "Pilots wins minimum one race",
            nickname = "getPilotsWins")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class))
    @GetMapping(
            value = "/drivers/winning/",
            produces = "application/json")
    ResponseEntity<List<PilotSimpleResponse>> getPilotsWins();

    @ApiOperation(
            value = "return pilot with most wins gap",
            nickname = "getPilotWinsGap")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = PilotResponse.class))
    @GetMapping(
            value = "/drivers/wins-gap/",
            produces = "application/json")
    ResponseEntity<PilotResponse> getPilotWinsGap();

    @ApiOperation(
            value = "get pilots and teams",
            nickname = "getPilotsAndTeams")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class))
    @GetMapping(
            value = "/drivers/teams",
            produces = "application/json")
    ResponseEntity<List<PilotFullResponse>> getPilotsAndTeams(int number, int page);

    @ApiOperation(
            value = "Get all nationalities",
            nickname = "getNationalities")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class))
    @GetMapping(
            value = "/nationalities/wins/",
            produces = "application/json")
    ResponseEntity<List<NationalityResponse>> getNationalities();

    @ApiOperation(
            value = "Get pilots filtered by season and round",
            nickname = "getNationalities")
    @ApiResponses(
            @ApiResponse(code = 200, message = "OK", response = ResponseEntity.class))
    @GetMapping(
            value = "/races/{season}/{round}",
            produces = "application/json")
    ResponseEntity<List<PilotResponse>> getPilots(String season, String round);
}
