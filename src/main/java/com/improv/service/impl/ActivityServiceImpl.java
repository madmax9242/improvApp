package com.improv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.improv.dao.ActivityDao;
import com.improv.models.Activity;
import com.improv.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {
	
	@Autowired
	ActivityDao actDao;

	@Override
	public List<Activity> getAllActivities() {
		return actDao.findAll();
	}

	@Override
	public Activity createActivity(Activity a) {
		return actDao.save(a);
	}

	@Override
	public void deleteActivityById(int id) {
		actDao.deleteById(id);
		
	}

}
