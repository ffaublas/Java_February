package com.faublas.ninjas_dojos_onemany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faublas.ninjas_dojos_onemany.models.Ninja;


@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

}
