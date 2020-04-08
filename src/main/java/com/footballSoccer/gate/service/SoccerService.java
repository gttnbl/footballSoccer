package com.footballSoccer.gate.service;

import java.util.List;

public interface SoccerService {
	public List<String> getAllTeamPlayers(long teamId);
	public void addBarcelonaPlayer(String fname,String lname, String position, int number,Long id_pays);
}
