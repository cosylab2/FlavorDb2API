package com.example.mongodbapi.service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.repository.MoleculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class MoleculeService {

    @Autowired
    private MoleculeRepository moleculeRepository;

    // LFU Cache implementation using ConcurrentHashMap instead of LinkedHashMap
    private final int CACHE_SIZE = 100;
    private final Map<String, Molecule> cache = new ConcurrentHashMap<>();
    private final Queue<String> cacheOrder = new LinkedList<>();

    // Helper method to manage cache size
    private void manageCacheSize() {
        synchronized (cache) {
            while (cache.size() >= CACHE_SIZE && !cacheOrder.isEmpty()) {
                String oldestKey = cacheOrder.poll();
                cache.remove(oldestKey);
            }
        }
    }

    // Helper method to add to cache
    private void addToCache(String key, Molecule value) {
        synchronized (cache) {
            manageCacheSize();
            cache.put(key, value);
            cacheOrder.add(key);
        }
    }

    // Fetch all molecules that match the provided common name
    public List<Molecule> getMoleculesByCommonName(String common_name) {
        if (common_name == null || common_name.isEmpty()) {
            throw new IllegalArgumentException("common_name field cannot be null.");
        }

        // Check cache first
        String cacheKey = "commonName:" + common_name;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByCommonName(common_name);
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "commonName", common_name);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    // Fetch all molecules that match the provided functional groups
    public List<Molecule> getMoleculesByFunctionalGroups(String functional_groups) {
        if (functional_groups == null || functional_groups.isEmpty()) {
            throw new IllegalArgumentException("functional_groups field cannot be null.");
        }

        // Check cache first
        String cacheKey = "functionalGroups:" + functional_groups.toLowerCase();
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByFunctionalGroups(functional_groups.toLowerCase());
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "functionalGroups", functional_groups);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    public List<Molecule> getMoleculesByFlavorProfile(String flavorProfile) {
        if (flavorProfile == null || flavorProfile.isEmpty()) {
            throw new IllegalArgumentException("flavorProfile field cannot be null.");
        }

        // Check cache first
        String cacheKey = "flavorProfile:" + flavorProfile;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByFlavorProfile(flavorProfile);
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "flavorProfile", flavorProfile);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    public List<Molecule> getMoleculesByFemaFlavorProfile(String femaFlavorProfile) {
        if (femaFlavorProfile == null || femaFlavorProfile.isEmpty()) {
            throw new IllegalArgumentException("femaFlavorProfile field cannot be null.");
        }

        // Check cache first
        String cacheKey = "femaFlavorProfile:" + femaFlavorProfile;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByFemaFlavorProfile(femaFlavorProfile);
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "femaFlavorProfile", femaFlavorProfile);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    public List<Molecule> getMoleculesByPubchemId(Integer pubchem_id) {
        if (pubchem_id == null || pubchem_id <= 0) {
            throw new IllegalArgumentException("pubchem_id field cannot be null or zero/negative.");
        }

        // Check cache first
        String cacheKey = "pubchemId:" + pubchem_id;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByPubchemId(pubchem_id);
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "pubchem_id", pubchem_id);
        }

        // Cache the first result if available
        if (!molecules.isEmpty()) {
            addToCache(cacheKey, molecules.get(0));
        }
        
        return molecules;
    }

    public List<Molecule> getMoleculesByMonoisotopicMass(Double monoisotopicMass) {
        if (monoisotopicMass == null || monoisotopicMass <= 0) {
            throw new IllegalArgumentException("monoisotopic_mass field cannot be null or zero/negative.");
        }

        // Check cache first
        String cacheKey = "monoisotopicMass:" + monoisotopicMass;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        System.out.println("Querying for Monoisotopic Mass: " + monoisotopicMass);
        List<Molecule> molecules = moleculeRepository.findByMonoisotopicMass(monoisotopicMass);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "monoisotopicMass", monoisotopicMass);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    public List<Molecule> getMoleculesByTopologicalPolarSurfaceArea(Double topologicalPolarSurfaceArea) {
        if (topologicalPolarSurfaceArea == null || topologicalPolarSurfaceArea <= 0) {
            throw new IllegalArgumentException("topological_polar_surface_area field cannot be null or zero/negative.");
        }

        // Check cache first
        String cacheKey = "topologicalPolarSurfaceArea:" + topologicalPolarSurfaceArea;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        System.out.println("Querying for Topological Polar Surface Area: " + topologicalPolarSurfaceArea);
        List<Molecule> molecules = moleculeRepository.findByTopologicalPolarSurfaceArea(topologicalPolarSurfaceArea);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "topologicalPolarSurfaceArea", topologicalPolarSurfaceArea);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    public List<Molecule> getMoleculesByHeavyAtomCount(Integer heavyAtomCount) {
        if (heavyAtomCount == null || heavyAtomCount <= 0) {
            throw new IllegalArgumentException("heavy_atom_count field cannot be null or zero/negative.");
        }

        // Check cache first
        String cacheKey = "heavyAtomCount:" + heavyAtomCount;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        System.out.println("Querying for Heavy Atom Count: " + heavyAtomCount);
        List<Molecule> molecules = moleculeRepository.findByHeavyAtomCount(heavyAtomCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "heavyAtomCount", heavyAtomCount);
        }

        // Cache the first result
        addToCache(cacheKey, molecules.get(0));
        return molecules;
    }

    // Service method for 'from' only
    public List<Molecule> findMoleculesByWeightFrom(Double from) {
        if (from == null || from < 0) {
            throw new IllegalArgumentException("from field cannot be null or negative.");
        }

        // This result can be large, so we don't cache it
        List<Molecule> molecules = moleculeRepository.findByMolecularWeightGreaterThanEqual(from);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "MoleculesByWeightFrom", from);
        }
        return molecules;
    }

    // Service method for 'from' and 'to'
    public List<Molecule> findMoleculesByWeightRange(Double from, Double to) {
        if (from == null || from < 0 || to == null || to < 0) {
            throw new IllegalArgumentException("from/to field cannot be null or negative.");
        }

        // This result can be large, so we don't cache it
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

        // Check cache first
        String cacheKey = "hbdCount:" + hbdCount;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules = moleculeRepository.findByHbdCount(hbdCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "ByHbdCount", hbdCount);
        }

        // Cache the first result
        if (!molecules.isEmpty()) {
            addToCache(cacheKey, molecules.get(0));
        }
        
        return molecules;
    }

    public List<Molecule> findByHbaCount(Integer hbaCount) {
        if (hbaCount == null || hbaCount < 0) {
            throw new IllegalArgumentException("hbaCount field cannot be null or negative.");
        }

        // Check cache first
        String cacheKey = "hbaCount:" + hbaCount;
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }
        
        List<Molecule> molecules = moleculeRepository.findByHbaCount(hbaCount);
        
        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "ByHbaCount", hbaCount);
        }

        // Cache the first result
        if (!molecules.isEmpty()) {
            addToCache(cacheKey, molecules.get(0));
        }
        
        return molecules;
    }

    public List<Molecule> findByType(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type field cannot be null.");
        }

        // Check cache first
        String cacheKey = "type:" + type.toLowerCase();
        if (cache.containsKey(cacheKey)) {
            return Collections.singletonList(cache.get(cacheKey));
        }

        List<Molecule> molecules;
        if (type.equalsIgnoreCase("natural")) {
            molecules = moleculeRepository.findByNatural(1);
        } else if (type.equalsIgnoreCase("synthetic")) {
            molecules = moleculeRepository.findBySynthetic(1);
        } else if (type.equalsIgnoreCase("unknown")) {
            molecules = moleculeRepository.findByUnknownNatural(1);
        } else {
            throw new IllegalArgumentException("Invalid type value");
        }

        if (molecules.isEmpty()) {
            throw new ResourceNotFoundException("molecules_data", "type", type);
        }

        // For type searches, we won't cache as the result sets could be large
        return molecules;    
    }

    // Method to clear cache if needed
    public void clearCache() {
        synchronized (cache) {
            cache.clear();
            cacheOrder.clear();
        }
    }

    public MoleculeRepository getMoleculeRepository() {
        return moleculeRepository;
    }

    public void setMoleculeRepository(MoleculeRepository moleculeRepository) {
        this.moleculeRepository = moleculeRepository;
    }
}