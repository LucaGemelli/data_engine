package com.data.code.model.repository;

import com.data.code.model.entity.Circuit;
import com.data.code.model.entity.Result;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CircuitRepository extends CrudRepository<Circuit, Long> {}
