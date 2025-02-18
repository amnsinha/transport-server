package com.transport.service;

import com.transport.entity.Driver;
import com.transport.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    // Create or Update Driver
    public Driver saveDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    // Retrieve all Drivers
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    // Retrieve Driver by ID
    public Optional<Driver> getDriverById(Long id) {
        return driverRepository.findById(id);
    }

    // Retrieve Driver by Driver Number
    public Driver getDriverByDriverNumber(String driverNumber) {
        return driverRepository.findByDriverNumber(driverNumber);
    }

    // Delete Driver by ID
    public void deleteDriverById(Long id) {
        driverRepository.deleteById(id);
    }
}
