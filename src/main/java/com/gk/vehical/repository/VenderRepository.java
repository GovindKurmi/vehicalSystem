package com.gk.vehical.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gk.vehical.model.Vender;

@Repository
public interface VenderRepository extends MongoRepository<Vender, Integer> {

	List<Vender> findByVehicalType(String vehicalType);

}
