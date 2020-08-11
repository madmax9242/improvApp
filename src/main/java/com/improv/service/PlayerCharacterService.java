package com.improv.service;

import java.util.List;

import com.improv.models.PlayerCharacter;

public interface PlayerCharacterService {
	
	public List<PlayerCharacter> getAllCharacters();
	public PlayerCharacter getCharacterById(int id);
	public PlayerCharacter createCharacter(PlayerCharacter pc);
	public void deleteCharacter(int id);
	public void deleteCharacterByName(String name);

}
