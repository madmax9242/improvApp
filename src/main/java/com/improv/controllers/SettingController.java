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

import com.improv.dao.SettingDao;
import com.improv.models.Setting;
import com.improv.service.SettingService;

@CrossOrigin
@RestController
public class SettingController {
	
	@Autowired
	SettingService settingService;
	
	@GetMapping("/setting/all")
	public List<Setting> getAllSettings() {
		return settingService.getAllSettings();
	}
	
	@PostMapping("/setting")
	public Setting createSetting(@RequestBody Setting s) {
		return settingService.createSetting(s);
	}
	
	@DeleteMapping("/setting/{id}")
	public void deleteSetting(@PathVariable int id) {
		settingService.deleteSettingById(id);
	}
	
	@GetMapping("/setting/data")
	public void createSampleSettings() {
		settingService.createSetting(new Setting(1, "Football Field"));
		settingService.createSetting(new Setting(2, "Hospital"));
		settingService.createSetting(new Setting(3, "Bar"));
		settingService.createSetting(new Setting(4, "Courthouse"));
		settingService.createSetting(new Setting(5, "Parking Lot"));
		settingService.createSetting(new Setting(1, "Auditorium"));
		settingService.createSetting(new Setting(2, "Alleyway"));
		settingService.createSetting(new Setting(3, "Park"));
		settingService.createSetting(new Setting(4, "Playground"));
		settingService.createSetting(new Setting(5, "Forest"));
	}
	

}
