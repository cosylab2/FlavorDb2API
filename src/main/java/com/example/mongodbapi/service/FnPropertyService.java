package com.example.mongodbapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.repository.FnPropertyRepository;

@Service
public class FnPropertyService {

    @Autowired
    private FnPropertyRepository fnPropertyRepository;

    private void validateInput(String fieldName, String value) {
        if (!StringUtils.hasText(value)) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }

    public List<FnProperty> getPropertiesByCoeNo(String coeNo) {
        validateInput("CoeNo", coeNo);
        List<FnProperty> properties = fnPropertyRepository.findByCoeNo(coeNo);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "CoeNo", coeNo);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByFemaNo(Double femaNo) {
        if (femaNo == null) {
            throw new IllegalArgumentException("FemaNo cannot be null");
        }
        List<FnProperty> properties = fnPropertyRepository.findByFemaNo(femaNo);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "FemaNo", femaNo.toString());
        }
        return properties;
    }

    public List<FnProperty> getFnPropertiesByFlNo(String flNo) {
        validateInput("FlNo", flNo);
        List<FnProperty> properties = fnPropertyRepository.findByFlNo(flNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "FlNo", flNo);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByNasNo(String nasNo) {
        validateInput("NasNo", nasNo);
        List<FnProperty> properties = fnPropertyRepository.findByNasNo(nasNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "NasNo", nasNo);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByEinecsNo(String einecsNo) {
        validateInput("EinecsNo", einecsNo);
        List<FnProperty> properties = fnPropertyRepository.findByEinecsNo(einecsNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "EinecsNo", einecsNo);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByJecfaNo(String jecfaNo) {
        validateInput("JecfaNo", jecfaNo);
        List<FnProperty> properties = fnPropertyRepository.findByJecfaNo(jecfaNo.trim());
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("fn_properties_data", "JecfaNo", jecfaNo);
        }
        return properties;
    }

    public List<FnProperty> getPropertiesByTasteThreshold(String values) {
        validateInput("TasteThresholdValues", values);
        return buildQueryForField(values, "Taste_threshold_values");
    }

    public List<FnProperty> getPropertiesBySynthesis(String values) {
        validateInput("Synthesis", values);
        return buildQueryForField(values, "Synthesis");
    }

    private List<FnProperty> buildQueryForField(String values, String fieldName) {
        values = values.trim();
        List<String> andValues = new ArrayList<>();
        List<String> orValues = new ArrayList<>();

        if (values.contains("@")) {
            andValues.addAll(Arrays.asList(values.split("@")));
        } else if (values.contains("!")) {
            orValues.addAll(Arrays.asList(values.split("!")));
        } else {
            andValues.add(values);
        }

        List<Pattern> andPatterns = new ArrayList<>();
        for (String value : andValues) {
            andPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        List<Pattern> orPatterns = new ArrayList<>();
        for (String value : orValues) {
            orPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        return fnPropertyRepository.findByField(andPatterns, orPatterns, fieldName);
    }

    public List<FnProperty> getPropertiesByTradeAssociationGuidelines(String tradeAssociationGuidelines) {
        validateInput("TradeAssociationGuidelines", tradeAssociationGuidelines);
        return fnPropertyRepository.findByTradeAssociationGuidelines(tradeAssociationGuidelines.trim());
    }

    public List<FnProperty> getPropertiesByNaturalOccurrence(String naturalOccurrence) {
        validateInput("NaturalOccurrence", naturalOccurrence);
        return fnPropertyRepository.findByNaturalOccurrence(naturalOccurrence.trim());
    }

    public List<FnProperty> getPropertiesByAromaThresholdValues(String aromaThresholdValues) {
        validateInput("AromaThresholdValues", aromaThresholdValues);
        return fnPropertyRepository.findByAromaThresholdValues(aromaThresholdValues.trim());
    }

    public List<FnProperty> getPropertiesByDescription(String description) {
        validateInput("Description", description);
        return fnPropertyRepository.findByDescriptionContainingIgnoreCase(description.trim());
    }

    public List<FnProperty> getPropertiesByIofiCategorisation(String iofiCategorisation) {
        validateInput("IofiCategorisation", iofiCategorisation);
        return fnPropertyRepository.findByIofiCategorisationContainingIgnoreCase(iofiCategorisation.trim());
    }

    public List<FnProperty> getPropertiesByCoeApproval(String coeApproval) {
        validateInput("CoeApproval", coeApproval);
        return fnPropertyRepository.findByCoeApprovalContainingIgnoreCase(coeApproval.trim());
    }
}
