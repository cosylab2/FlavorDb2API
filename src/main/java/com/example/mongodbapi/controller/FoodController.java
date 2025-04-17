package com.example.mongodbapi.controller;

import com.example.mongodbapi.service.FoodService;
import com.example.mongodbapi.service.FoodPairingService; // Import FoodPairingService
import com.example.mongodbapi.model.FoodPairing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private FoodPairingService foodPairingService; // Inject FoodPairingService

    private static final Logger logger = LoggerFactory.getLogger(FoodController.class);

    // Updated method to use getEntityIdByReadableAlias
    /* 
    @GetMapping("/by-alias/{alias}")
    public ResponseEntity<?> getEntityIdAndSimilarEntities(@PathVariable String alias) {
        logger.info("Received request to fetch entity ID and similar entities for alias: {}", alias);

        Optional<String> entityIdOpt = foodService.getEntityIdByReadableAlias(alias);

        if (entityIdOpt.isEmpty()) {
            logger.warn("No Entity ID found for alias: {}", alias);
            return ResponseEntity.notFound().build();
        }

        String entityId = entityIdOpt.get();
        logger.info("Entity ID found for alias {}: {}", alias, entityId);

        System.out.println("Food Controller is Called");

        // Now, call the FoodPairingService to get the top 10 similar entities
        List<FoodPairing.SimilarEntity> similarEntities = foodPairingService.getTop10SimilarEntities(entityId);

        Map<String, Object> response = new HashMap<>();
        response.put("entityId", entityId);
        response.put("topSimilarEntities", similarEntities);

        return ResponseEntity.ok(response);
    }
    */
    @GetMapping(value = "/by-alias/{alias}", produces = "application/json")
public ResponseEntity<?> getEntityIdAndSimilarEntities(@PathVariable String alias) {
    logger.info("Received request to fetch entity ID and similar entities for alias: {}", alias);

    Optional<String> entityIdOpt = foodService.getEntityIdByReadableAlias(alias);

    if (entityIdOpt.isEmpty()) {
        logger.warn("No Entity ID found for alias: {}", alias);
        return ResponseEntity.notFound().build();
    }

    String entityId = entityIdOpt.get();
    logger.info("Entity ID found for alias {}: {}", alias, entityId);

    List<FoodPairing.SimilarEntity> similarEntities = foodPairingService.getTop10SimilarEntities(entityId);

    Map<String, Object> response = new HashMap<>();
    response.put("entityId", entityId);
    response.put("topSimilarEntities", similarEntities);

    return ResponseEntity.ok(response);
}
}
