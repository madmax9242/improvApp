package com.improv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.improv.dao.ActivityDao;
import com.improv.dao.PlayerCharacterDao;
import com.improv.dao.SettingDao;
import com.improv.models.Activity;
import com.improv.models.PlayerCharacter;
import com.improv.models.Scenario;
import com.improv.models.Setting;
import com.improv.service.ActivityService;
import com.improv.service.PlayerCharacterService;
import com.improv.service.ScenarioService;
import com.improv.service.SettingService;

@CrossOrigin
@RestController

public class ScenarioController {
	
	@Autowired
	ScenarioService scenarioService;
	PlayerCharacterService pcs;
	SettingService ss;
	ActivityService as;
	
	@GetMapping("/scenario/all")
	public List<Scenario> getAllScenarios() {
		return scenarioService.findAllScenarios();
	}
	
	@GetMapping("/scenario/{id}")
	public Scenario getScenarioById(@PathVariable int id) {
		return scenarioService.findScenarioById(id);
	}
	
	@PostMapping("/scenario")
	public Scenario saveScenario(@RequestBody Scenario sc) {
		return scenarioService.createScenario(sc);
	}
	
	@DeleteMapping("/scenario/{id}")
	public void deleteScenarioById(@PathVariable int id) {
		scenarioService.deleteScenarioById(id);
	}

}
