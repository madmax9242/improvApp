package com.improv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.improv.dao.PlayerCharacterDao;
import com.improv.models.PlayerCharacter;
import com.improv.service.PlayerCharacterService;

@Service
public class PlayerCharacterServiceImpl implements PlayerCharacterService {
	
	@Autowired
	PlayerCharacterDao charDao;

	@Override
	public List<PlayerCharacter> getAllCharacters() {
		return charDao.findAll();
	}
	
	@Override
	public PlayerCharacter getCharacterById(int id) {
		return charDao.findById(id).get();
	}

	@Override
	public PlayerCharacter createCharacter(PlayerCharacter pc) {
		return charDao.save(pc);
	}

	@Override
	public void deleteCharacter(int id) {
		charDao.deleteById(id);
		
	}

	@Override
	public void deleteCharacterByName(String name) {
		charDao.deletePlayerCharacterByName(name);
		
	}

}
