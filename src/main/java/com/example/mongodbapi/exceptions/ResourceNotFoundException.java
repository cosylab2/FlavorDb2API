package com.example.mongodbapi.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    String resourceName;
    String fieldName;
    String fieldValue;
    String fieldName1;
    String fieldValue1;
    long fieldValueInt;
    double fieldValueDouble;
    double fieldValueDouble1;

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));

        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue, String fieldName1, String fieldValue1) {
        super(String.format("%s not found with %s : %s and %s : %s", resourceName, fieldName, fieldValue, fieldName1, fieldValue1));

        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.fieldName1 = fieldName1;
        this.fieldValue1 = fieldValue1;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, long fieldValueInt) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValueInt));

        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValueInt = fieldValueInt;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, double fieldValueDouble) {
        super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValueDouble));

        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValueDouble = fieldValueDouble;
    }

    public ResourceNotFoundException(String resourceName, String fieldName, double fieldValueDouble, double fieldValueDouble1) {
        super(String.format("%s not found with %s from : %s to %s", resourceName, fieldName, fieldValueDouble, fieldValueDouble1));

        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValueDouble = fieldValueDouble;
        this.fieldValueDouble1 = fieldValueDouble1;

    }
}
