package com.data.code.mappers;

import com.data.code.model.entity.Pilot;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PilotMapper {
    PilotResponse toPilotResponse(Pilot pilot);

    PilotFullResponse toPilotFullResponse(Pilot pilot);
}
