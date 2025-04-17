package com.example.mongodbapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "food_pairing")
public class FoodPairing {

    @Id
    private String id;

    @Field("food_id")
    private String foodId;

    @Field("similar_entities")
    private String similarEntities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getSimilarEntities() {
        return similarEntities;
    }

    public void setSimilarEntities(String similarEntities) {
        this.similarEntities = similarEntities;
    }

    // Updated SimilarEntity class with proper JSON property annotations
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimilarEntity {
        @JsonProperty("entity_name")
        private String entityName;
        
        @JsonProperty("category")
        private String category;
        
        @JsonProperty("similar_molecules")
        private int similarMolecules;
        
        @JsonProperty("wikipedia")
        private String wikipedia;

        // Default constructor needed for Jackson
        public SimilarEntity() {
        }

        // Getters and setters
        public String getEntityName() {
            return entityName;
        }

        public void setEntityName(String entityName) {
            this.entityName = entityName;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getSimilarMolecules() {
            return similarMolecules;
        }

        public void setSimilarMolecules(int similarMolecules) {
            this.similarMolecules = similarMolecules;
        }

        public String getWikipedia() {
            return wikipedia;
        }

        public void setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
        }
    }
}

