package com.footballSoccer.gate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballSoccer.gate.model.Pays;
import com.footballSoccer.gate.model.Player;
import com.footballSoccer.gate.model.Team;
import com.footballSoccer.gate.model.enums.Position;
import com.footballSoccer.gate.repository.PlayerRepository;
import com.footballSoccer.gate.repository.TeamRepository;

@Service
public class SoccerServiceImpl implements SoccerService {

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private TeamRepository teamRepository;

	public List<String> getAllTeamPlayers(long teamId) {
		List<String> result = new ArrayList<String>();
		List<Player> players = playerRepository.findById(teamId);
		for (Player player : players) {
			result.add(player.getFirstName());
		}

		return result;
	}

	public void addBarcelonaPlayer(String fName ,String lName , String position, int number,Long id_pays) {
		
		Team barcelona = teamRepository.findOne(1l);
		Pays py= new Pays();
		py.setId(id_pays);
		Player newPlayer = new Player();
		newPlayer.setFirstName(fName);
		newPlayer.setLastName(lName);
		newPlayer.setNationalite(py);
		newPlayer.setPosition(Position.aillier_gauche);
		newPlayer.setNum(number);
	//	newPlayer.setTeam(barcelona);
		playerRepository.save(newPlayer);
	}

	
}
