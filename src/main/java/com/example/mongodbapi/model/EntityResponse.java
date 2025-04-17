package com.example.mongodbapi.model;

import java.util.List;

public class EntityResponse {

    private String entityId;
    private List<SimilarEntity> topSimilarEntities;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public List<SimilarEntity> getTopSimilarEntities() {
        return topSimilarEntities;
    }

    public void setTopSimilarEntities(List<SimilarEntity> topSimilarEntities) {
        this.topSimilarEntities = topSimilarEntities;
    }

    public static class SimilarEntity {
        private String entityName;
        private String category;
        private int similarMolecules;
        private String wikipedia;

        public SimilarEntity(String entityName, String category, int similarMolecules, String wikipedia) {
            this.entityName = entityName;
            this.category = category;
            this.similarMolecules = similarMolecules;
            this.wikipedia = wikipedia;
        }

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
