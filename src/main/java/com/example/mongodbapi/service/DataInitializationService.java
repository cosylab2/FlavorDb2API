package com.example.mongodbapi.service;

import com.example.mongodbapi.model.FoodPairing;
import com.example.mongodbapi.repository.FoodPairingRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

@Service
public class DataInitializationService implements CommandLineRunner {

    @Autowired
    private FoodPairingRepository foodPairingRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void run(String... args) throws Exception {
        initializeFoodPairingData();
    }

    private void initializeFoodPairingData() {
        try {
            // Check if data already exists
            long count = foodPairingRepository.count();
            System.out.println("Food pairing data exists. Count: " + count);
            
            // Fix existing data by setting foodId equal to id
            List<FoodPairing> existingPairings = foodPairingRepository.findAll();
            int updatedCount = 0;
            
            for (FoodPairing pairing : existingPairings) {
                if (pairing.getFoodId() == null || pairing.getFoodId().trim().isEmpty()) {
                    pairing.setFoodId(pairing.getId());
                    foodPairingRepository.save(pairing); // Save each document individually
                    updatedCount++;
                    
                    // Log progress every 100 records
                    if (updatedCount % 100 == 0) {
                        System.out.println("Updated " + updatedCount + " records so far...");
                    }
                }
            }
            
            if (updatedCount > 0) {
                System.out.println("Successfully updated " + updatedCount + " records to set foodId equal to id");
            } else {
                System.out.println("No records needed updating");
            }
            
            // Verify the update
            List<FoodPairing> verifyPairings = foodPairingRepository.findAll();
            int nullFoodIds = 0;
            for (FoodPairing pairing : verifyPairings) {
                if (pairing.getFoodId() == null || pairing.getFoodId().trim().isEmpty()) {
                    nullFoodIds++;
                }
            }
            System.out.println("After update, records with null foodId: " + nullFoodIds);
            
            return;
        } catch (Exception e) {
            System.err.println("Error initializing food pairing data: " + e.getMessage());
            e.printStackTrace();
        }
    }
}