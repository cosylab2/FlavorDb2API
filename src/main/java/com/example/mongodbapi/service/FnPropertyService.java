package com.example.mongodbapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.repository.FnPropertyRepository;

@Service
public class FnPropertyService {

    @Autowired
    private FnPropertyRepository fnPropertyRepository;

    // Fetch all properties that match the provided CoE_No
    public List<FnProperty> getPropertiesByCoeNo(String coeNo) {
        List<FnProperty> properties = fnPropertyRepository.findByCoeNo(coeNo);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "CoeNo", coeNo);
        }
        return properties;
    }

    // Fetch all properties that match the provided FemaNo
    public List<FnProperty> getPropertiesByFemaNo(Double femaNo) {
        List<FnProperty> properties = fnPropertyRepository.findByFemaNo(femaNo);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "FemaNo", femaNo.toString());
        }
        return properties;
    }

    public List<FnProperty> getFnPropertiesByFlNo(String flNo) {
        // Log the input to verify it matches the stored value
        System.out.println("Querying for FL No.: '" + flNo + "'");

        // Trim and query the repository
        List<FnProperty> properties = fnPropertyRepository.findByFlNo(flNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "FlNo", flNo);
        }
        return properties;
    }

    // Fetch all properties that match the provided NAS_No
    public List<FnProperty> getPropertiesByNasNo(String nasNo) {
        // Log the input for debugging
        System.out.println("Querying for NAS No.: '" + nasNo + "'");

        // Trim and query the repository
        List<FnProperty> properties = fnPropertyRepository.findByNasNo(nasNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "NasNo", nasNo);
        }
        return properties;
    }

    // Fetch all properties that match the provided EINECS_No
    public List<FnProperty> getPropertiesByEinecsNo(String einecsNo) {
        // Log the input for debugging
        System.out.println("Querying for EINECS No.: '" + einecsNo + "'");

        // Trim and query the repository
        List<FnProperty> properties = fnPropertyRepository.findByEinecsNo(einecsNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "EinecsNo", einecsNo);
        }
        return properties;
    }

    // Fetch all properties that match the provided JECFA_No
    public List<FnProperty> getPropertiesByJecfaNo(String jecfaNo) {
        // Log the input for debugging
        System.out.println("Querying for JECFA No.: '" + jecfaNo + "'");

        // Trim and query the repository
        List<FnProperty> properties = fnPropertyRepository.findByJecfaNo(jecfaNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "JecfaNo", jecfaNo);
        }
        return properties;
    }

    // Existing method for "Taste_threshold_values"
    public List<FnProperty> getPropertiesByTasteThreshold(String values) {
        List<FnProperty> properties = buildQueryForField(values, "Taste_threshold_values");
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "Taste_threshold_values", values);
        }
        return properties;
    }

    // New method for "Synthesis" field
    public List<FnProperty> getPropertiesBySynthesis(String values) {
        List<FnProperty> properties = buildQueryForField(values, "Synthesis");
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "Synthesis", values);
        }
        return properties;
    }

    // Helper method to avoid duplication of logic
    private List<FnProperty> buildQueryForField(String values, String fieldName) {
        values = values.trim();
        List<String> andValues = new ArrayList<>();
        List<String> orValues = new ArrayList<>();

        // Check if the string contains '@' (AND condition)
        if (values.contains("@")) {
            andValues.addAll(Arrays.asList(values.split("@")));
        }
        // Check if the string contains '!' (OR condition)
        else if (values.contains("!")) {
            orValues.addAll(Arrays.asList(values.split("!")));
        }
        // If neither '@' nor '!' is present, treat as a single value
        else {
            andValues.add(values);
        }

        // Generate a list of Mongo regex patterns for AND values
        List<Pattern> andPatterns = new ArrayList<>();
        for (String value : andValues) {
            andPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        // Generate a list of Mongo regex patterns for OR values
        List<Pattern> orPatterns = new ArrayList<>();
        for (String value : orValues) {
            orPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        // Return the filtered results based on AND and OR conditions
        return fnPropertyRepository.findByField(andPatterns, orPatterns, fieldName);
    }

    public List<FnProperty> getPropertiesByTradeAssociationGuidelines(String tradeAssociationGuidelines) {
        // Log the input for debugging
        System.out.println("Querying for Trade Association Guidelines: '" + tradeAssociationGuidelines + "'");

        List<FnProperty> properties = fnPropertyRepository.findByTradeAssociationGuidelines(tradeAssociationGuidelines.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "TradeAssociationGuidelines", tradeAssociationGuidelines);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByNaturalOccurrence(String naturalOccurrence) {
        // Log the input for debugging
        System.out.println("Querying for Natural Occurrence: '" + naturalOccurrence + "'");

        List<FnProperty> properties = fnPropertyRepository.findByNaturalOccurrence(naturalOccurrence.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "NaturalOccurrence", naturalOccurrence);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByAromaThresholdValues(String aromaThresholdValues) {
        // Log the input for debugging
        System.out.println("Querying for Aroma Threshold Values: '" + aromaThresholdValues + "'");

        List<FnProperty> properties = fnPropertyRepository.findByAromaThresholdValues(aromaThresholdValues.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "AromaThresholdValues", aromaThresholdValues);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByDescription(String description) {
        // Log the input for debugging
        System.out.println("Querying for Description: '" + description + "'");

        List<FnProperty> properties = fnPropertyRepository.findByDescriptionContainingIgnoreCase(description.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "Description", description);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByIofiCategorisation(String iofiCategorisation) {
        // Log the input for debugging
        System.out.println("Querying for IOFI Categorisation: '" + iofiCategorisation + "'");

        List<FnProperty> properties = fnPropertyRepository.findByIofiCategorisationContainingIgnoreCase(iofiCategorisation.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "IofiCategorisation", iofiCategorisation);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByCoeApproval(String coeApproval) {
        // Log the input for debugging
        System.out.println("Querying for CoE Approval: '" + coeApproval + "'");

        List<FnProperty> properties = fnPropertyRepository.findByCoeApprovalContainingIgnoreCase(coeApproval.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "CoeApproval", coeApproval);
        }
        return properties;
    }

    // public List<FnProperty> getPropertiesByFoodCategory(String values) {
    // // Log the input for debugging
    // System.out.println("Querying for Food Category: '" + values + "'");

    // // Trim and query the repository
    // List<FnProperty> properties = fnPropertyRepository.findByFoodCategory(values.trim());
    // if (properties.isEmpty()) {
    //     throw new ResourceNotFoundException("fn_properties_data", "FoodCategory", values);
    // }
    // return properties;
}


