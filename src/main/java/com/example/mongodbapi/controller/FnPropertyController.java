package com.example.mongodbapi.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.service.FnPropertyService;

@RestController
@RequestMapping("/api/properties")
public class FnPropertyController {

    @Autowired
    private FnPropertyService fnPropertyService;

    // 1️⃣ GET property by CoE_No
    @GetMapping("/by-coe")
    public ResponseEntity<?> getPropertiesByCoeNo(@RequestParam("coe_no") String coeNo) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByCoeNo(coeNo);
        return buildResponse(properties, "CoE_No", coeNo);
    }

    // 2️⃣ GET property by FemaNo
    @GetMapping("/by-fema")
    public ResponseEntity<?> getPropertiesByFemaNo(@RequestParam("fema_no") Double femaNo) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByFemaNo(femaNo);
        return buildResponse(properties, "FemaNo", femaNo);
    }

    // 3️⃣ GET property by FL_No
    @GetMapping("/by-flNo")
    public ResponseEntity<?> getFnPropertiesByFlNo(@RequestParam("fl_no") String flNo) {
        List<FnProperty> properties = fnPropertyService.getFnPropertiesByFlNo(flNo);
        return buildResponse(properties, "FL_No", flNo);
    }

    // 4️⃣ GET property by NAS_No
    @GetMapping("/by-nas")
    public ResponseEntity<?> getPropertiesByNasNo(@RequestParam("nas_no") String nasNo) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByNasNo(nasNo);
        return buildResponse(properties, "NAS_No", nasNo);
    }

    // 5️⃣ GET property by EINECS_No
    @GetMapping("/by-einecs")
    public ResponseEntity<?> getPropertiesByEinecsNo(@RequestParam("einecs_no") String einecsNo) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByEinecsNo(einecsNo);
        return buildResponse(properties, "EINECS_No", einecsNo);
    }

    // 6️⃣ GET property by JECFA_No
    @GetMapping("/by-jecfa")
    public ResponseEntity<?> getPropertiesByJecfaNo(@RequestParam("jecfa_no") String jecfaNo) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByJecfaNo(jecfaNo);
        return buildResponse(properties, "JECFA_No", jecfaNo);
    }

    // 7️⃣ GET property by Taste Threshold
    @GetMapping("/taste-threshold")
    public ResponseEntity<?> getPropertiesByTasteThreshold(@RequestParam("values") String values) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByTasteThreshold(values);
        return buildResponse(properties, "Taste Threshold", values);
    }

    // 8️⃣ GET property by Synthesis
    @GetMapping("/synthesis")
    public ResponseEntity<?> getPropertiesBySynthesis(@RequestParam("values") String values) {
        List<FnProperty> properties = fnPropertyService.getPropertiesBySynthesis(values);
        return buildResponse(properties, "Synthesis", values);
    }

    // 9️⃣ GET property by Trade Association Guidelines
    @GetMapping("/by-tradeAssociationGuidelines")
    public ResponseEntity<?> getPropertiesByTradeAssociationGuidelines(@RequestParam("guideline") String guideline) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByTradeAssociationGuidelines(guideline);
        return buildResponse(properties, "Trade Association Guidelines", guideline);
    }

    // 🔟 GET property by Natural Occurrence
    @GetMapping("/by-naturalOccurrence")
    public ResponseEntity<?> getPropertiesByNaturalOccurrence(@RequestParam("occurrence") String occurrence) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByNaturalOccurrence(occurrence);
        return buildResponse(properties, "Natural Occurrence", occurrence);
    }

    // 1️⃣1️⃣ GET property by Aroma Threshold Values
    @GetMapping("/by-aromaThresholdValues")
    public ResponseEntity<?> getPropertiesByAromaThresholdValues(@RequestParam("threshold") String threshold) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByAromaThresholdValues(threshold);
        return buildResponse(properties, "Aroma Threshold Values", threshold);
    }

    // 1️⃣2️⃣ GET property by Description
    @GetMapping("/by-description")
    public ResponseEntity<?> getPropertiesByDescription(@RequestParam("desc") String description) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByDescription(description);
        return buildResponse(properties, "Description", description);
    }

    // 1️⃣3️⃣ GET property by IOFI Categorisation
    @GetMapping("/by-iofi-categorisation")
    public ResponseEntity<?> getPropertiesByIofiCategorisation(@RequestParam("category") String category) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByIofiCategorisation(category);
        return buildResponse(properties, "IOFI Categorisation", category);
    }

    // 1️⃣4️⃣ GET property by CoE Approval
    @GetMapping("/by-coe-approval")
    public ResponseEntity<?> getPropertiesByCoeApproval(@RequestParam("coe_approval") String coeApproval) {
        List<FnProperty> properties = fnPropertyService.getPropertiesByCoeApproval(coeApproval);
        return buildResponse(properties, "CoE Approval", coeApproval);
    }

    // 1️⃣5️⃣ Utility Method to Handle Not Found Responses
    private ResponseEntity<?> buildResponse(List<FnProperty> properties, String field, Object value) {
        if (properties.isEmpty()) {
            return ResponseEntity.status(404).body(Map.of(
                "statusCode", 404,
                "message", field + " not found: " + value
            ));
        }
        return ResponseEntity.ok(properties);
    }
}
