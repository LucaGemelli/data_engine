package com.data.code.model.repository;

import com.data.code.model.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {

    List<Result> findResultsByDriverId(Long driverId);

    Result findFirstByDriverId(Long driverId);
}
