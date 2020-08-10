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
import com.improv.models.Activity;
import com.improv.service.ActivityService;

@CrossOrigin
@RestController
public class ActivityController {
	
	@Autowired
	ActivityService activityService;
	
	@GetMapping("/activity/all")
	public List<Activity> getAllActivities() {
		return activityService.getAllActivities();
	}
	
	@PostMapping("/activity")
	public Activity createActivity(@RequestBody Activity a) {
		return activityService.createActivity(a);
	}
	
	@DeleteMapping("/activity/{id}")
	public void deleteActivityById(@PathVariable int id) {
		activityService.deleteActivityById(id);
	}
	
	@GetMapping("/activity/data")
	public void createSampleActivities() {
		activityService.createActivity(new Activity(1, "Playing baseball"));
		activityService.createActivity(new Activity(2, "Drinking"));
		activityService.createActivity(new Activity(3, "Hiding a body"));
		activityService.createActivity(new Activity(4, "Talking politics"));
		activityService.createActivity(new Activity(5, "Watching TV"));
		activityService.createActivity(new Activity(6, "Working out"));
		activityService.createActivity(new Activity(7, "Throwing a frisbee"));
		activityService.createActivity(new Activity(8, "Walking dogs"));
		activityService.createActivity(new Activity(9, "Running from the cops"));
		activityService.createActivity(new Activity(10, "Practicing for a play"));
	}

}
