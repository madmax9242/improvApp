package com.improv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.improv.dao.SettingDao;
import com.improv.models.Setting;
import com.improv.service.SettingService;

@Service
public class SettingServiceImpl implements SettingService {
	
	@Autowired
	SettingDao sDao;

	@Override
	public List<Setting> getAllSettings() {
		return sDao.findAll();
	}

	@Override
	public Setting createSetting(Setting s) {
		return sDao.save(s);
	}

	@Override
	public void deleteSettingById(int id) {
		sDao.deleteById(id);
		
	}

}
