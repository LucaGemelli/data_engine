package com.data.code.mappers;

import com.data.code.model.response.ResultResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDate;
import java.time.Period;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ResultMapper {

    ResultResponse toPilotSimpleResponse(Long driverId, Long totalMonths, LocalDate firstDate, LocalDate lastDate);
}
