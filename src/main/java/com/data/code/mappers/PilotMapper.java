package com.data.code.mappers;

import com.data.code.model.entity.Pilot;
import com.data.code.model.response.PilotFullResponse;
import com.data.code.model.response.PilotResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

//@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public class PilotMapper {
    
    public PilotMapper() {
    }

    public PilotResponse toPilotResponse(Pilot pilot) {return null;};

    public PilotFullResponse toPilotFullResponse(Pilot pilot) {return null;};
}
