package com.data.code.service;

import com.data.code.model.entity.Result;
import com.data.code.model.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record ResultService(ResultRepository resultRepository) {

    public List<Result> findResults(Long driverId) {
        return null;
    }
}
