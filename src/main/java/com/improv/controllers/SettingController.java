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
		settingService.createSetting(new Setting(6, "Auditorium"));
		settingService.createSetting(new Setting(7, "Alleyway"));
		settingService.createSetting(new Setting(8, "Park"));
		settingService.createSetting(new Setting(9, "Playground"));
		settingService.createSetting(new Setting(10, "Forest"));
		settingService.createSetting(new Setting(11, "Baseball Field"));
		settingService.createSetting(new Setting(12, "Swamp"));
		settingService.createSetting(new Setting(13, "Wine Bar"));
		settingService.createSetting(new Setting(14, "Living Room"));
		settingService.createSetting(new Setting(15, "Library"));
		settingService.createSetting(new Setting(16, "Movie Theater"));
		settingService.createSetting(new Setting(17, "Footlocker"));
		settingService.createSetting(new Setting(18, "The Mall"));
		settingService.createSetting(new Setting(19, "SPACE!!!"));
		settingService.createSetting(new Setting(20, "An Intersection"));
	}
	

}
