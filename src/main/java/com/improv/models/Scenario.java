package com.improv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "scenario_seq", initialValue = 101)
@Table
public class Scenario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "scenario_seq")
	private int id;
	private int characterId;
	private int characterId2;
	private int settingId;
	private int activityId;
	
	public Scenario() {
		
	}
	
	public Scenario(int id, int characterId, int characterId2, int settingId, int activityId) {
		super();
		this.id = id;
		this.characterId = characterId;
		this.characterId2 = characterId2;
		this.settingId = settingId;
		this.activityId = activityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCharacterId() {
		return characterId;
	}

	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	public int getCharacterId2() {
		return characterId2;
	}

	public void setCharacterId2(int characterId2) {
		this.characterId2 = characterId2;
	}

	public int getSettingId() {
		return settingId;
	}

	public void setSettingId(int settingId) {
		this.settingId = settingId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	
	
	
	
	
	

}
