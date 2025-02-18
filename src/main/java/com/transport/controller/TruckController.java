package com.transport.controller;

import com.transport.entity.Trucks;
import com.transport.service.TrucksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/trucks")
public class TruckController {

    @Autowired
    private TrucksService truckService;

    // Create or Update Truck
    @PostMapping
    public ResponseEntity<Trucks> saveTruck(@RequestBody Trucks truck) {
        Trucks savedTruck = truckService.saveTruck(truck);
        return ResponseEntity.ok(savedTruck);
    }

    // Get all Trucks
    @GetMapping
    public ResponseEntity<List<Trucks>> getAllTrucks() {
        List<Trucks> trucks = truckService.getAllTrucks();
        return ResponseEntity.ok(trucks);
    }

    // Get Truck by ID
    @GetMapping("/{id}")
    public ResponseEntity<Trucks> getTruckById(@PathVariable Long id) {
        Optional<Trucks> truck = truckService.getTruckById(id);
        return truck.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete Truck by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruckById(@PathVariable Long id) {
        truckService.deleteTruckById(id);
        return ResponseEntity.noContent().build();
    }
}
