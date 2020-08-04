package com.improv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "activity_seq", initialValue = 1)
@Table
public class Activity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_seq")
	private int id;
	private String name;
	
	public Activity() {
		
	}

	public Activity(int id, String name) {
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
