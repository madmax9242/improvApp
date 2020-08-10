package com.improv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.improv.models.PlayerCharacter;

@Repository
public interface PlayerCharacterDao extends JpaRepository<PlayerCharacter, Integer> {
	public void deletePlayerCharacterByName(String name);

}
