package com.niit.FurnitureApp.repository;

import com.niit.FurnitureApp.model.Furniture;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurnitureRepository extends MongoRepository<Furniture,String> {
}
