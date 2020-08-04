package com.improv.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.improv.models.Scenario;

public interface ScenarioService {
	
	public Scenario createScenario(Scenario s);
	public Scenario findScenarioById(Integer id);
	public List<Scenario> findAllScenarios();
	public Scenario updateScenario(Scenario s);
	public void deleteScenarioById(Integer id);

}
