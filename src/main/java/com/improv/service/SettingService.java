package com.improv.service;

import java.util.List;

import com.improv.models.Setting;

public interface SettingService {
	
	public List<Setting> getAllSettings();
	public Setting createSetting(Setting s);
	public void deleteSettingById(int id);

}
