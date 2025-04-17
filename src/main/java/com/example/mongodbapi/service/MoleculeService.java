package com.example.mongodbapi.service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.repository.MoleculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoleculeService {

    @Autowired
    private MoleculeRepository moleculeRepository;

    // Fetch all molecules that match the provided common name
    public List<Molecule> getMoleculesByCommonName(String common_name) {
        List<Molecule> molecules = moleculeRepository.findByCommonName(common_name);
        if (common_name == null || common_name == "") {
            throw new IllegalArgumentException("common_name field cannot be null.");
        }
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "commonName", common_name);
        }
        return molecules;
    }
    // Fetch all molecules that match the provided functional groups
    public List<Molecule> getMoleculesByFunctionalGroups(String functional_groups) {

        functional_groups = functional_groups.toLowerCase();
        if (functional_groups == null || functional_groups == "") {
            throw new IllegalArgumentException("functional_groups field cannot be null.");
        }

        List<Molecule> molecules = moleculeRepository.findByFunctionalGroups(functional_groups);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "functionalGroups", functional_groups);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByFlavorProfile(String flavorProfile) {
        List<Molecule> molecules = moleculeRepository.findByFlavorProfile(flavorProfile);
        if (flavorProfile == null || flavorProfile == "") {
            throw new IllegalArgumentException("flavorProfile field cannot be null.");
        }
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "flavorProfile", flavorProfile);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByFemaFlavorProfile(String femaFlavorProfile) {
        List<Molecule> molecules = moleculeRepository.findByFemaFlavorProfile(femaFlavorProfile);
        if (femaFlavorProfile == null || femaFlavorProfile == "") {
            throw new IllegalArgumentException("femaFlavorProfile field cannot be null.");
        }
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "femaFlavorProfile", femaFlavorProfile);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByPubchemId(Integer pubchem_id) {
        if (pubchem_id == null || pubchem_id <= 0) {
            throw new IllegalArgumentException("pubchem_id field cannot be null or zero/negative.");
        }
        List<Molecule> molecules = moleculeRepository.findByPubchemId(pubchem_id);
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "pubchem_id", pubchem_id);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByMonoisotopicMass(Double monoisotopicMass) {

        if (monoisotopicMass == null || monoisotopicMass.isNaN() || monoisotopicMass <= 0) {
            throw new IllegalArgumentException("monoisotopic_mass field cannot be null or zero/negative.");
        }
        System.out.println("Querying for Monoisotopic Mass: " + monoisotopicMass);
        List<Molecule> molecules = moleculeRepository.findByMonoisotopicMass(monoisotopicMass);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "monoisotopicMass", monoisotopicMass);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByTopologicalPolarSurfaceArea(Double topologicalPolarSurfaceArea) {
        if (topologicalPolarSurfaceArea == null || topologicalPolarSurfaceArea.isNaN() || topologicalPolarSurfaceArea <= 0) {
            throw new IllegalArgumentException("topological_polar_surface_area field cannot be null or zero/negative.");
        }
        System.out.println("Querying for Topological Polar Surface Area: " + topologicalPolarSurfaceArea);
        List<Molecule> molecules = moleculeRepository.findByTopologicalPolarSurfaceArea(topologicalPolarSurfaceArea);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "topologicalPolarSurfaceArea", topologicalPolarSurfaceArea);
        }
        return molecules;
    }

    public List<Molecule> getMoleculesByHeavyAtomCount(Integer heavyAtomCount) {
        if (heavyAtomCount == null || heavyAtomCount <= 0) {
            throw new IllegalArgumentException("heavy_atom_count field cannot be null or zero/negative.");
        }
        System.out.println("Querying for Heavy Atom Count: " + heavyAtomCount);
        List<Molecule> molecules = moleculeRepository.findByHeavyAtomCount(heavyAtomCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "heavyAtomCount", heavyAtomCount);
        }
        return molecules;
    }
    // Service method for 'from' only
    public List<Molecule> findMoleculesByWeightFrom(Double from) {
        if (from == null || from.isNaN() || from < 0) {
            throw new IllegalArgumentException("from field cannot be null or negative.");
        }

        List<Molecule> molecules = moleculeRepository.findByMolecularWeightGreaterThanEqual(from);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "MoleculesByWeightFrom", from);
        }
        return molecules;
    }
    // Service method for 'from' and 'to'
    public List<Molecule> findMoleculesByWeightRange(Double from, Double to) {
        if (from == null || from.isNaN() || from < 0 || to == null || to.isNaN() || to < 0) {
            throw new IllegalArgumentException("from/to field cannot be null or negative.");
        }

        List<Molecule> molecules = moleculeRepository.findByExactMassBetween(from, to);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "MoleculesByWeightRange", from, to);
        }
        return molecules;
    }

    public List<Molecule> findByHbdCount(Integer hbdCount) {
        if (hbdCount == null || hbdCount < 0) {
            throw new IllegalArgumentException("hbdCount field cannot be null or negative.");
        }

        List<Molecule> molecules = moleculeRepository.findByHbdCount(hbdCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "ByHbdCount", hbdCount);
        }
        return molecules;
    }

    public List<Molecule> findByHbaCount(Integer hbaCount) {
        if (hbaCount == null || hbaCount < 0) {
            throw new IllegalArgumentException("hbaCount field cannot be null or negative.");
        }
        
        List<Molecule> molecules = moleculeRepository.findByHbaCount(hbaCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "ByHbaCount", hbaCount);
        }
        return molecules;
    }

    public List<Molecule> findByType(String type) {
        List<Molecule> molecules = new ArrayList<>();
        if (type.equalsIgnoreCase("natural")) {
            molecules = moleculeRepository.findByNatural(1);
        } else if (type.equalsIgnoreCase("synthetic")) {
            molecules = moleculeRepository.findBySynthetic(1);
        } else if (type.equalsIgnoreCase("unknown")) {
            molecules = moleculeRepository.findByUnknownNatural(1);
        }

        if (type == null || type == "") {
            throw new IllegalArgumentException("type field cannot be null.");
        }

        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "type", type);
            }
        return molecules;    
    }

    public MoleculeRepository getMoleculeRepository() {
        return moleculeRepository;
    }

    public void setMoleculeRepository(MoleculeRepository moleculeRepository) {
        this.moleculeRepository = moleculeRepository;
    }
}
