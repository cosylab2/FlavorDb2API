package com.example.mongodbapi.service;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodbapi.exceptions.ResourceNotFoundException;
import com.example.mongodbapi.model.MoreProperty;
import com.example.mongodbapi.repository.MorePropertyRepository;

@Service
public class MorePropertyService {

    @Autowired
    private MorePropertyRepository morePropertyRepository;

    private static final int CACHE_SIZE = 1000;

    // Primary cache (stores data)
    private final ConcurrentHashMap<String, List<MoreProperty>> cache = new ConcurrentHashMap<>();
    // Frequency Map to track how often each key is accessed
    private final ConcurrentHashMap<String, Integer> frequency = new ConcurrentHashMap<>();
    // Eviction Priority Queue based on Least Frequently Used (LFU) strategy
    private final PriorityBlockingQueue<String> evictionQueue = new PriorityBlockingQueue<>(CACHE_SIZE, Comparator.comparingInt(frequency::get));

    // Thread pool for parallel fetching
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);

    // ========================= CACHING HELPER METHODS ========================= //

    private synchronized void incrementFrequency(String cacheKey) {
        frequency.merge(cacheKey, 1, Integer::sum);
        evictionQueue.remove(cacheKey);
        evictionQueue.offer(cacheKey);
    }

    private synchronized void addToCache(String cacheKey, List<MoreProperty> properties) {
        if (cache.size() >= CACHE_SIZE) {
            evictLFU();
        }
        cache.put(cacheKey, properties);
        frequency.put(cacheKey, 1);
        evictionQueue.offer(cacheKey);
    }

    private synchronized void evictLFU() {
        String lfuKey = evictionQueue.poll();
        if (lfuKey != null) {
            cache.remove(lfuKey);
            frequency.remove(lfuKey);
        }
    }

    private void printCacheStats() {
        System.out.println("Cache Size: " + cache.size());
        System.out.println("Frequency Map: " + frequency);
    }

    // ========================= ENDPOINTS WITH LFU CACHING & PARALLEL FETCHING ========================= //

    // Fetch properties that match the provided number of aromatic rings
    public CompletableFuture<List<MoreProperty>> getPropertiesByNumberOfAromaticRings(int numberOfAromaticRings) {
        String cacheKey = "numberOfAromaticRings_" + numberOfAromaticRings;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Number of Aromatic Rings: " + numberOfAromaticRings);
            List<MoreProperty> properties = morePropertyRepository.findByNumberOfAromaticRings(numberOfAromaticRings);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "NumberOfAromaticRings", String.valueOf(numberOfAromaticRings));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided number of aromatic bonds
    public CompletableFuture<List<MoreProperty>> getPropertiesByNumberOfAromaticBonds(int numberOfAromaticBonds) {
        String cacheKey = "numberOfAromaticBonds_" + numberOfAromaticBonds;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Number of Aromatic Bonds: " + numberOfAromaticBonds);
            List<MoreProperty> properties = morePropertyRepository.findByNumberOfAromaticBonds(numberOfAromaticBonds);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "NumberOfAromaticBonds", String.valueOf(numberOfAromaticBonds));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided number of rings
    public CompletableFuture<List<MoreProperty>> getPropertiesByNumRings(int numRings) {
        String cacheKey = "numRings_" + numRings;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Number of Rings: " + numRings);
            List<MoreProperty> properties = morePropertyRepository.findByNumRings(numRings);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "NumRings", String.valueOf(numRings));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided number of rotatable bonds
    public CompletableFuture<List<MoreProperty>> getPropertiesByNumRotatableBonds(int numRotatableBonds) {
        String cacheKey = "numRotatableBonds_" + numRotatableBonds;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Number of Rotatable Bonds: " + numRotatableBonds);
            List<MoreProperty> properties = morePropertyRepository.findByNumRotatableBonds(numRotatableBonds);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "NumRotatableBonds", String.valueOf(numRotatableBonds));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided surface area
    public CompletableFuture<List<MoreProperty>> getPropertiesBySurfaceArea(double surfaceArea) {
        String cacheKey = "surfaceArea_" + surfaceArea;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Surface Area: " + surfaceArea);
            List<MoreProperty> properties = morePropertyRepository.findBySurfaceArea(surfaceArea);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "SurfaceArea", String.valueOf(surfaceArea));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided ALogP value
    public CompletableFuture<List<MoreProperty>> getPropertiesByAlogp(double alogp) {
        String cacheKey = "alogp_" + alogp;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for ALogP: " + alogp);
            List<MoreProperty> properties = morePropertyRepository.findByAlogp(alogp);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "Alogp", String.valueOf(alogp));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided number of atoms
    public CompletableFuture<List<MoreProperty>> getPropertiesByNumberOfAtoms(int numberOfAtoms) {
        String cacheKey = "numberOfAtoms_" + numberOfAtoms;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Number of Atoms: " + numberOfAtoms);
            List<MoreProperty> properties = morePropertyRepository.findByNumberOfAtoms(numberOfAtoms);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "NumberOfAtoms", String.valueOf(numberOfAtoms));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // Fetch properties that match the provided energy value
    public CompletableFuture<List<MoreProperty>> getPropertiesByEnergy(double energy) {
        String cacheKey = "energy_" + energy;
        if (cache.containsKey(cacheKey)) {
            incrementFrequency(cacheKey);
            return CompletableFuture.completedFuture(cache.get(cacheKey));
        }

        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Querying for Energy: " + energy);
            List<MoreProperty> properties = morePropertyRepository.findByEnergy(energy);
            if (properties.isEmpty()) {
                throw new ResourceNotFoundException("more_properties_data", "Energy", String.valueOf(energy));
            }
            addToCache(cacheKey, properties);
            return properties;
        }, executorService);
    }

    // ========================= SHUTDOWN ========================= //

    public void shutdown() {
        executorService.shutdown();
    }
}