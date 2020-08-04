package com.improv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "setting_seq", initialValue = 1)
@Table
public class Setting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "setting_seq")
	private int id;
	private String name;
	
	public Setting() {
		
	}

	public Setting(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
