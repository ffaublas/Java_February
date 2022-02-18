package com.faublas.ninjas_dojos_onemany.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.faublas.ninjas_dojos_onemany.models.Ninja;
import com.faublas.ninjas_dojos_onemany.models.Dojo;
import com.faublas.ninjas_dojos_onemany.repositories.NinjaRepository;
import com.faublas.ninjas_dojos_onemany.repositories.DojoRepository;

@Service

public class AppService {

	private final DojoRepository dojoRepo;
	private final NinjaRepository ninjaRepo;
	
	
	public AppService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
		
	}
	
	//create a dojo
	public Dojo createDojo(Dojo dj) {
		return this.dojoRepo.save(dj);
	}
	
	//get all the dojos
	public List<Dojo> getAllDojos(){
		return (List<Dojo>)this.dojoRepo.findAll();
	}
	
	
	//create a ninja
	public Ninja createNinja(Ninja nj) {
		return this.ninjaRepo.save(nj);
	}
	
	//get one team by id
	public Dojo getOneTeam(Long id) {
		
		return this.dojoRepo.findById(id).orElse(null);
	}



}
