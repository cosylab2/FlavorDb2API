package com.example.mongodbapi.service;

// Original Code.. 

import com.example.mongodbapi.model.FoodEntity;
import com.example.mongodbapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;
    
    // Code Involving Entity_alias_readable functionality
      
    public Optional<String> getEntityIdByReadableAlias(String aliasReadable) {
    List<FoodEntity> foodEntities = foodRepository.findEntityIdByEntityAliasReadable(aliasReadable);
    if (!foodEntities.isEmpty()) {
        return Optional.ofNullable(foodEntities.get(0).getEntityId());
    }
    return Optional.empty();
}
}

