package com.footballSoccer.gate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.footballSoccer.gate.model.Player;
import com.footballSoccer.gate.service.PlayerService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController(value = "/players")
public class PlayerController {

	@Autowired
	PlayerService playerService;
//testtestefezrgfefzefgerzergfezrgergre"
//testtestefezrgfefzefgerzergfezrgergre"
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces={"application/json"},headers = "Accept=application/json")
	public List<Player> gelAllPlayers() {

		List<Player> players = playerService.getAllPlayers();

		System.out.println(players);
		
		return players;

	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces={"application/json"},headers = "Accept=application/json")
	public List<Player> test() {

		List<Player> players = playerService.getAllPlayers();

		System.out.println(players);

		return players;

	}
}
