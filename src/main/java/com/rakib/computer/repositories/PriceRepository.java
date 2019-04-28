package com.rakib.computer.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.rakib.computer.models.Price;

public interface PriceRepository extends MongoRepository<Price,String>{
	
	Price findBy_id(ObjectId _id);
}
