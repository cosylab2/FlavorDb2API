package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityRepository extends MongoRepository<Entity, String> {

    @Query("{ 'entity_alias': { $regex: ?0, $options: 'i' }, 'category': { $regex: ?1, $options: 'i' } }")
    List<Entity> findByEntityAliasContainingIgnoreCaseAndCategoryContainingIgnoreCase(String entityAlias, String category);
    @Query("{ 'natural_source_name': { $regex: ?0, $options: 'i' } }")
    List<Entity> findByNaturalSourceNameContainingIgnoreCase(String naturalSourceName);
    @Query("{ 'entity_alias_readable': { $regex: ?0, $options: 'i' } }")
    List<Entity> findByEntityAliasReadableContainingIgnoreCase(String entityAliasReadable);
}