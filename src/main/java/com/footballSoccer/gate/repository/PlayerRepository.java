package com.footballSoccer.gate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.footballSoccer.gate.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

	List<Player> findById(long id);
	
	List<Player> findAll();
	
	
}
