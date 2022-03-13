package com.example.springdatamysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdatamysql.domain.Aircraft;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
