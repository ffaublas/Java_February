package com.faublas.teamplayersonetomany.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faublas.teamplayersonetomany.models.Player;
import com.faublas.teamplayersonetomany.models.Team;
import com.faublas.teamplayersonetomany.repositories.PlayerRepository;
import com.faublas.teamplayersonetomany.repositories.TeamRepository;

@Service
public class AppService {
	
	private final TeamRepository teamRepo;
	private final PlayerRepository playerRepo;
	
	
	public AppService(TeamRepository teamRepo, PlayerRepository playerRepo) {
		
		this.teamRepo = teamRepo;
		this.playerRepo = playerRepo;
	}
	
	
	//create a team
	public Team createTeam(Team t) {
		return this.teamRepo.save(t);
	}
	
	//get all the teams
	public List<Team> getAllTeams(){
		return (List<Team>)this.teamRepo.findAll();
	}
	
	
	//create a player
	public Player createPlayer(Player p) {
		return this.playerRepo.save(p);
	}
	
	//get one team by id
	public Team getOneTeam(Long id) {
		
		return this.teamRepo.findById(id).orElse(null);
	}
	
	
}