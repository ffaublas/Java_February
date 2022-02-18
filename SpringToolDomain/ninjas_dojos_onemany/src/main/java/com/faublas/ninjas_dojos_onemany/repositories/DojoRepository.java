package com.faublas.ninjas_dojos_onemany.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faublas.ninjas_dojos_onemany.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {

}
