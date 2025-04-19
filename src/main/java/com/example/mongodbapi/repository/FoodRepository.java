/*package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FoodEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface FoodRepository extends MongoRepository<FoodEntity, String> {

    // Case-insensitive search using regex
    @Query("{'entity_alias': {$regex: ?0, $options: 'i'}}")
    Optional<FoodEntity> findByEntityAliasIgnoreCase(String entityAlias);  // Search by food alias
    
}

*/

// DEEPSEEK
package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FoodEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface FoodRepository extends MongoRepository<FoodEntity, String> {

    // Case-insensitive search for entity_alias and only return entity_id
   // @Query(value = "{'entity_alias': { $regex: ?0, $options: 'i' }}", fields = "{'entity_id': 1}")

   

   // Code for entity_alias
   /* 
   @Query(value = "{'entity_alias': { $regex: ?0, $options: 'i' }}", fields = "{'entity_id': 1}")
   Optional<FoodEntity> findEntityIdByEntityAlias(String entityAlias);
   */
   
   // Code for entity_alias_readable..
   /* 
   
   @Query("{ 'entity_alias_readable': { $regex: ?0, $options: 'i' } }")
   Optional<FoodEntity> findEntityIdByEntityAliasReadable(String aliasReadable);
   */

   @Query("{ 'entity_alias_readable': { $regex: '^?0$', $options: 'i' } }")
   List<FoodEntity> findEntityIdByEntityAliasReadable(String aliasReadable);

}
