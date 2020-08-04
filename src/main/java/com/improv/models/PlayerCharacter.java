package com.improv.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "pc_seq", initialValue = 1)
@Table
public class PlayerCharacter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pc_seq")
	private int id;
	private String name;
	
	public PlayerCharacter() {
		
	}

	public PlayerCharacter(int id, String name) {

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
