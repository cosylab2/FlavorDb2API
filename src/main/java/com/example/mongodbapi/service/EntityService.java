package com.example.mongodbapi.service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.Entity;
import com.example.mongodbapi.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;

    // Service method to find entities by alias and category
    public List<Entity> getEntitiesByAliasAndCategory(String entityAlias, String category) {
        List<Entity> entity = entityRepository.findByEntityAliasContainingIgnoreCaseAndCategoryContainingIgnoreCase(entityAlias, category);
        if (entityAlias == null || entityAlias == "" || category == null || category == "") {
            throw new IllegalArgumentException("entityAlias/category fields cannot be null.");
        }
        if (entity.isEmpty()) {
            throw new ResourceNotFoundException("entity", "entity_alias", entityAlias, "category", category);
        }
        return entity; 
    }
    public List<Entity> getEntitiesByNaturalSourceName(String naturalSourceName) {
        
        List<Entity> entity = entityRepository.findByNaturalSourceNameContainingIgnoreCase(naturalSourceName);
        if (naturalSourceName == null || naturalSourceName == "") {
            throw new IllegalArgumentException("entityAlias/category fields cannot be null.");
        }
        if (entity.isEmpty()) {
            throw new ResourceNotFoundException("entity", "natural_source_name", naturalSourceName);
        }
        return entity;
    }
    public List<Entity> getEntitiesByEntityAliasReadable(String entityAliasReadable) {
        List<Entity> entity = entityRepository.findByEntityAliasReadableContainingIgnoreCase(entityAliasReadable);
        if (entityAliasReadable == null || entityAliasReadable == "") {
            throw new IllegalArgumentException("entityAlias/category fields cannot be null.");
        }
        if (entity.isEmpty()) {
            throw new ResourceNotFoundException("entity", "entity_alias_readable", entityAliasReadable);
        }
        return entity;
    }
}
