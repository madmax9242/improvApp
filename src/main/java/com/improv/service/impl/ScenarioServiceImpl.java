package com.improv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.improv.dao.ScenarioDao;
import com.improv.models.Scenario;
import com.improv.service.ScenarioService;

@Service
public class ScenarioServiceImpl implements ScenarioService {

	@Autowired
	ScenarioDao sD;
	
	@Override
	public Scenario createScenario(Scenario s) {
		return sD.save(s);
	}

	@Override
	public Scenario findScenarioById(Integer id) {
		return sD.findById(id).get();
	}

	@Override
	public List<Scenario> findAllScenarios() {
		return sD.findAll();
	}

	@Override
	public Scenario updateScenario(Scenario s) {
		return sD.save(s);
	}

	@Override
	public void deleteScenarioById(Integer id) {
		sD.deleteById(id);
		
	}

}
