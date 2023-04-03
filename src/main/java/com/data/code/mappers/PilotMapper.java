package com.data.code.mappers;

import com.data.code.model.entity.Pilot;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import com.data.code.model.response.PilotSimpleResponse;
import com.data.code.model.response.ResultResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDate;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PilotMapper {


    @Mapping(source = "pilot.forename", target = "givenName")
    @Mapping(source = "pilot.surname", target = "familyName")
    @Mapping(source = "pilot.dob", target = "dateOfBirth")
    PilotSimpleResponse toPilotSimpleResponse(Pilot pilot, Long wins);

    @Mapping(source = "pilot.forename", target = "givenName")
    @Mapping(source = "pilot.surname", target = "familyName")
    @Mapping(source = "pilot.dob", target = "dateOfBirth")
    @Mapping(source = "response.firstDate", target = "firstWin")
    @Mapping(source = "response.lastDate", target = "lastWin")
    @Mapping(source = "response.driverId", target = "driverId")
    PilotResponse toPilotResponse(Pilot pilot, ResultResponse response);

    PilotFullResponse toPilotFullResponse(Pilot pilot);
}
