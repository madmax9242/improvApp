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
	
	@GetMapping("/character/{id}")
	public PlayerCharacter getCharacterById(@PathVariable int id) {
		return pcs.getCharacterById(id);
	}
	
	@PostMapping("/character")
	public PlayerCharacter createCharacter(@RequestBody PlayerCharacter pc) {
		return pcs.createCharacter(pc);
	}
	
	@DeleteMapping("/character/{id}")
	public void deleteCharacterById(@PathVariable int id) {
		pcs.deleteCharacter(id);
	}
	
	@DeleteMapping("/character/{name}")
	public void deleteCharacterByName(@PathVariable String name) {
		pcs.deleteCharacterByName(name);
	}
	
	@GetMapping("/character/data")
	public void makeSampleCharacters() {
		pcs.createCharacter(new PlayerCharacter(1, "Knight"));
		pcs.createCharacter(new PlayerCharacter(2, "Wizard"));
		pcs.createCharacter(new PlayerCharacter(3, "Librarian"));
		pcs.createCharacter(new PlayerCharacter(4, "Sheep Herder"));
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
		pcs.createCharacter(new PlayerCharacter(21, "Rat Trapper"));
		pcs.createCharacter(new PlayerCharacter(22, "Vacuum Salesman"));
		pcs.createCharacter(new PlayerCharacter(23, "Talking Dog"));
		pcs.createCharacter(new PlayerCharacter(24, "Milkman"));
		pcs.createCharacter(new PlayerCharacter(25, "Amazon Delivery Driver"));
		pcs.createCharacter(new PlayerCharacter(26, "Postman"));
		pcs.createCharacter(new PlayerCharacter(27, "Suburban Housewife"));
		pcs.createCharacter(new PlayerCharacter(28, "Necromancer"));
		pcs.createCharacter(new PlayerCharacter(29, "Transformer"));
		pcs.createCharacter(new PlayerCharacter(30, "Cowboy"));
	}

}
