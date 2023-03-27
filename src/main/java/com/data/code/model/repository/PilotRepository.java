package com.data.code.model.repository;

import com.data.code.model.entity.Pilot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends CrudRepository<Pilot, Long> {}
