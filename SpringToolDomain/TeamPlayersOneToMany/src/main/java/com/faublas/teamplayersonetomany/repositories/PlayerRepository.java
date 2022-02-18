package com.faublas.teamplayersonetomany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faublas.teamplayersonetomany.models.Player;


@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
