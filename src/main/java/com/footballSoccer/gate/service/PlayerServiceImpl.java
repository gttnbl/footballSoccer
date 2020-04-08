package com.footballSoccer.gate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.footballSoccer.gate.model.Player;
import com.footballSoccer.gate.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}
	
	

}
