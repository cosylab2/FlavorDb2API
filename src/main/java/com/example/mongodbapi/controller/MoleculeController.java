package com.example.mongodbapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.service.MoleculeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/molecules")
@Tag(name = "Molecule", description = "Molecule management APIs")
public class MoleculeController {

    @Autowired
    private MoleculeService moleculeService;

    @Operation(summary = "Get molecules by common name")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the molecules"),
        @ApiResponse(responseCode = "404", description = "No molecules found")
    })
    @GetMapping("/by-commonName")
    public ResponseEntity<List<Molecule>> getMolecules(
            @Parameter(description = "Common name of the molecule") 
            @RequestParam("common_name") String common_name) {
        List<Molecule> molecules = moleculeService.getMoleculesByCommonName(common_name);
        return ResponseEntity.ok(molecules);
    }

    @Operation(summary = "Get molecules by functional groups")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found the molecules"),
        @ApiResponse(responseCode = "404", description = "No molecules found")
    })
    @GetMapping("/by-functionalGroups")
    public List<Molecule> getMoleculesByFunctionalGroups(
            @Parameter(description = "Functional groups to search for (use @ for AND, ! for OR)") 
            @RequestParam("functional_groups") String functional_groups) {
        return moleculeService.getMoleculesByFunctionalGroups(functional_groups);
    }
}
