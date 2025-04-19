package com.example.mongodbapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.MoreProperty;
import com.example.mongodbapi.repository.MorePropertyRepository;

@Service
public class MorePropertyService {

    @Autowired
    private MorePropertyRepository morePropertyRepository;

    // Fetch properties that match the provided number of aromatic rings
    public List<MoreProperty> getPropertiesByNumberOfAromaticRings(int numberOfAromaticRings) {
        System.out.println("Querying for Number of Aromatic Rings: " + numberOfAromaticRings);
        List<MoreProperty> properties = morePropertyRepository.findByNumberOfAromaticRings(numberOfAromaticRings);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "NumberOfAromaticRings", String.valueOf(numberOfAromaticRings));
        }
        return properties;
    }

    // Fetch properties that match the provided number of aromatic bonds
    public List<MoreProperty> getPropertiesByNumberOfAromaticBonds(int numberOfAromaticBonds) {
        System.out.println("Querying for Number of Aromatic Bonds: " + numberOfAromaticBonds);
        List<MoreProperty> properties = morePropertyRepository.findByNumberOfAromaticBonds(numberOfAromaticBonds);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "NumberOfAromaticBonds", String.valueOf(numberOfAromaticBonds));
        }
        return properties;
    }

    // Fetch properties that match the provided number of rings
    public List<MoreProperty> getPropertiesByNumRings(int numRings) {
        System.out.println("Querying for Number of Rings: " + numRings);
        List<MoreProperty> properties = morePropertyRepository.findByNumRings(numRings);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "NumRings", String.valueOf(numRings));
        }
        return properties;
    }

    // Fetch properties that match the provided number of rotatable bonds
    public List<MoreProperty> getPropertiesByNumRotatableBonds(int numRotatableBonds) {
        System.out.println("Querying for Number of Rotatable Bonds: " + numRotatableBonds);
        List<MoreProperty> properties = morePropertyRepository.findByNumRotatableBonds(numRotatableBonds);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "NumRotatableBonds", String.valueOf(numRotatableBonds));
        }
        return properties;
    }

    // Fetch properties that match the provided surface area
    public List<MoreProperty> getPropertiesBySurfaceArea(double surfaceArea) {
        System.out.println("Querying for Surface Area: " + surfaceArea);
        List<MoreProperty> properties = morePropertyRepository.findBySurfaceArea(surfaceArea);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "SurfaceArea", String.valueOf(surfaceArea));
        }
        return properties;
    }

    // Fetch properties that match the provided ALogP value
    public List<MoreProperty> getPropertiesByAlogp(double alogp) {
        System.out.println("Querying for ALogP: " + alogp);
        List<MoreProperty> properties = morePropertyRepository.findByAlogp(alogp);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "Alogp", String.valueOf(alogp));
        }
        return properties;
    }

    // Fetch properties that match the provided number of atoms
    public List<MoreProperty> getPropertiesByNumberOfAtoms(int numberOfAtoms) {
        System.out.println("Querying for Number of Atoms: " + numberOfAtoms);
        List<MoreProperty> properties = morePropertyRepository.findByNumberOfAtoms(numberOfAtoms);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "NumberOfAtoms", String.valueOf(numberOfAtoms));
        }
        return properties;
    }

    // Fetch properties that match the provided energy value
    public List<MoreProperty> getPropertiesByEnergy(double energy) {
        System.out.println("Querying for Energy: " + energy);
        List<MoreProperty> properties = morePropertyRepository.findByEnergy(energy);
        if (properties.isEmpty()) {
            throw new ResourceNotFoundException("more_properties_data", "Energy", String.valueOf(energy));
        }
        return properties;
    }
}
