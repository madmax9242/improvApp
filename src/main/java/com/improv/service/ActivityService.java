package com.improv.service;

import java.util.List;

import com.improv.models.Activity;

public interface ActivityService {
	
	public List<Activity> getAllActivities();
	public Activity createActivity(Activity a);
	public void deleteActivityById(int id);

}
