package com.data.code.service;

import com.data.code.model.repository.CircuitRepository;
import org.springframework.stereotype.Service;

@Service
public record CircuitService(CircuitRepository circuitRepository) {

}
