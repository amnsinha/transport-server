package com.transport.service;

import com.transport.entitiy.Trucks;
import com.transport.repository.TrucksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrucksService {

    @Autowired
    private TrucksRepository trucksRepository;

    // Create or Update Truck
    public Trucks saveTruck(Trucks truck) {
        return trucksRepository.save(truck);
    }

    // Retrieve all Trucks
    public List<Trucks> getAllTrucks() {
        return trucksRepository.findAll();
    }

    // Retrieve Truck by ID
    public Optional<Trucks> getTruckById(Long id) {
        return trucksRepository.findById(id);
    }

    public List<Trucks> getTruckByTruckNumber(String truckNUmber) {
        return trucksRepository.findByTruckNumber(truckNUmber);
    }

    // Delete Truck by ID
    public void deleteTruckById(Long id) {
        trucksRepository.deleteById(id);
    }
}
