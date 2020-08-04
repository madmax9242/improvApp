package com.improv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.improv.models.Scenario;

@Repository
public interface ScenarioDao extends JpaRepository<Scenario, Integer> {

}
