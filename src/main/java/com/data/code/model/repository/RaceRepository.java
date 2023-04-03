package com.data.code.model.repository;

import com.data.code.model.entity.Race;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends CrudRepository<Race, Long> {
}
