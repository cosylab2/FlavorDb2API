package com.example.mongodbapi.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "fdb_entities")  // Ensure this matches your MongoDB collection name
public class FoodEntity {

    @Id
    private String id;

    @Field("entity_id")
    private String entityId;  // Change from int to String to match potential string data in MongoDB

    @Field("category")
    private String category;

    @Field("category_readable")
    private String categoryReadable;

    @Field("entity_alias")
    private String entityAlias;

    @Field("entity_alias_basket")
    private String entityAliasBasket;

    @Field("entity_alias_readable")
    private String entityAliasReadable;

    @Field("entity_alias_synonyms")
    private String entityAliasSynonyms;

    @Field("entity_alias_url")
    private String entityAliasUrl;

    @Field("natural_source_name")
    private String naturalSourceName;

    @Field("natural_source_url")
    private String naturalSourceUrl;

    // Constructors
    public FoodEntity() {}

    public FoodEntity(String id, String entityId, String category, String categoryReadable,
                      String entityAlias, String entityAliasBasket, String entityAliasReadable,
                      String entityAliasSynonyms, String entityAliasUrl, String naturalSourceName,
                      String naturalSourceUrl) {
        this.id = id;
        this.entityId = entityId;  // Update to String type in constructor
        this.category = category;
        this.categoryReadable = categoryReadable;
        this.entityAlias = entityAlias;
        this.entityAliasBasket = entityAliasBasket;
        this.entityAliasReadable = entityAliasReadable;
        this.entityAliasSynonyms = entityAliasSynonyms;
        this.entityAliasUrl = entityAliasUrl;
        this.naturalSourceName = naturalSourceName;
        this.naturalSourceUrl = naturalSourceUrl;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntityId() {
        return entityId;  // Change return type to String
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;  // Change setter to accept String
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryReadable() {
        return categoryReadable;
    }

    public void setCategoryReadable(String categoryReadable) {
        this.categoryReadable = categoryReadable;
    }

    public String getEntityAlias() {
        return entityAlias;
    }

    public void setEntityAlias(String entityAlias) {
        this.entityAlias = entityAlias;
    }

    public String getEntityAliasBasket() {
        return entityAliasBasket;
    }

    public void setEntityAliasBasket(String entityAliasBasket) {
        this.entityAliasBasket = entityAliasBasket;
    }

    public String getEntityAliasReadable() {
        return entityAliasReadable;
    }

    public void setEntityAliasReadable(String entityAliasReadable) {
        this.entityAliasReadable = entityAliasReadable;
    }

    public String getEntityAliasSynonyms() {
        return entityAliasSynonyms;
    }

    public void setEntityAliasSynonyms(String entityAliasSynonyms) {
        this.entityAliasSynonyms = entityAliasSynonyms;
    }

    public String getEntityAliasUrl() {
        return entityAliasUrl;
    }

    public void setEntityAliasUrl(String entityAliasUrl) {
        this.entityAliasUrl = entityAliasUrl;
    }

    public String getNaturalSourceName() {
        return naturalSourceName;
    }

    public void setNaturalSourceName(String naturalSourceName) {
        this.naturalSourceName = naturalSourceName;
    }

    public String getNaturalSourceUrl() {
        return naturalSourceUrl;
    }

    public void setNaturalSourceUrl(String naturalSourceUrl) {
        this.naturalSourceUrl = naturalSourceUrl;
    }
}


