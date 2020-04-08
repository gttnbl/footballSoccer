package com.footballSoccer.gate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.footballSoccer.gate.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

	//Team findByPlayers(long playerId);
}
