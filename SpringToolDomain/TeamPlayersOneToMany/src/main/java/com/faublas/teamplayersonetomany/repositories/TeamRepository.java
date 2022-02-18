package com.faublas.teamplayersonetomany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faublas.teamplayersonetomany.models.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}