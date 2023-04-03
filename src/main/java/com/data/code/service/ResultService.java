package com.data.code.service;

import com.data.code.mappers.ResultMapper;
import com.data.code.model.entity.Result;
import com.data.code.model.repository.ResultRepository;
import com.data.code.model.response.ResultResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;
import static java.time.LocalDate.parse;
import static java.time.Period.between;

@Service
public record ResultService(ResultRepository resultRepository, ResultMapper resultMapper) {

    public Boolean verifyHasTwoOrMoreWins(Long driverId) {
        return resultRepository.findResultsByDriverId(driverId).stream().filter(result -> verifyIsNumericAndConvert(result.getPosition()) == 1).count() > 2;
    }

    public ResultResponse getWinsGapPeriod(Long driverId) {
        List<Result> results = resultRepository.findResultsByDriverId(driverId);
        List<LocalDate> dates = results.stream().map(Result::getRace).map(race -> parse(race.getDate())).collect(Collectors.toList());
        LocalDate firstDate = dates.stream().min(LocalDate::compareTo).get();
        LocalDate lastDate = dates.stream().max(LocalDate::compareTo).get();
        return resultMapper.toPilotSimpleResponse(driverId, between(firstDate, lastDate).toTotalMonths(), firstDate, lastDate);
    }

    private Integer verifyIsNumericAndConvert(String str) {
        if (str != null && str.matches("[0-9.]+")) {
            return valueOf(str);
        } else {
            return 0;
        }

    }
}
