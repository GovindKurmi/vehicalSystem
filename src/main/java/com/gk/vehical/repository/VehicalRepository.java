package com.gk.vehical.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gk.vehical.model.Vehical;

@Repository
public interface VehicalRepository extends MongoRepository<Vehical, Integer> {
    

}
