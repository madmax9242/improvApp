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

import com.improv.dao.PlayerCharacterDao;
import com.improv.models.PlayerCharacter;
import com.improv.service.PlayerCharacterService;

@CrossOrigin
@RestController
public class PlayerCharacterController {
	
	@Autowired
	PlayerCharacterService pcs;
	
	@GetMapping("/character/all")
	public List<PlayerCharacter> getAllCharacters() {
		return pcs.getAllCharacters();
	}
	
	@PostMapping("/character")
	public PlayerCharacter createCharacter(@RequestBody PlayerCharacter pc) {
		return pcs.createCharacter(pc);
	}
	
	@DeleteMapping("/character/{id}")
	public void deleteCharacterById(@PathVariable int id) {
		pcs.deleteCharacter(id);
	}
	
	@GetMapping("/character/data")
	public void makeSampleCharacters() {
		pcs.createCharacter(new PlayerCharacter(1, "Knight"));
		pcs.createCharacter(new PlayerCharacter(2, "Wizard"));
		pcs.createCharacter(new PlayerCharacter(3, "Librarian"));
		pcs.createCharacter(new PlayerCharacter(4, "Cowboy"));
		pcs.createCharacter(new PlayerCharacter(5, "Fugitive"));
		pcs.createCharacter(new PlayerCharacter(6, "Drunk"));
		pcs.createCharacter(new PlayerCharacter(7, "Doctor"));
		pcs.createCharacter(new PlayerCharacter(8, "Hockey Player"));
		pcs.createCharacter(new PlayerCharacter(9, "Lawyer"));
		pcs.createCharacter(new PlayerCharacter(10, "Gamer"));
		pcs.createCharacter(new PlayerCharacter(11, "Vet"));
		pcs.createCharacter(new PlayerCharacter(12, "Baseball Player"));
		pcs.createCharacter(new PlayerCharacter(13, "Pizza Delivery Guy"));
		pcs.createCharacter(new PlayerCharacter(14, "Cleric"));
		pcs.createCharacter(new PlayerCharacter(15, "Rogue"));
		pcs.createCharacter(new PlayerCharacter(16, "Werewolf"));
		pcs.createCharacter(new PlayerCharacter(17, "Werebear"));
		pcs.createCharacter(new PlayerCharacter(18, "Teacher"));
		pcs.createCharacter(new PlayerCharacter(19, "Eagles Fan"));
		pcs.createCharacter(new PlayerCharacter(20, "Steelers Fan"));
	}

}
