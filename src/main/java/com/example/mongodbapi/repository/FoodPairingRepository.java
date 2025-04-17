package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FoodPairing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FoodPairingRepository extends MongoRepository<FoodPairing, String> {

    List<FoodPairing> findByFoodId(String foodId);
}
