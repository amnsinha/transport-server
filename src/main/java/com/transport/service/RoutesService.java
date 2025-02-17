package com.transport.service;

import com.transport.entitiy.RouteLocation;
import com.transport.repository.RoutesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoutesService {

    @Autowired
    private RoutesRepository routeLocationRepository;

    // Create or Update RouteLocation
    public RouteLocation saveRouteLocation(RouteLocation routeLocation) {
        return routeLocationRepository.save(routeLocation);
    }

    // Retrieve all RouteLocations
    public List<RouteLocation> getAllRouteLocations() {
        return routeLocationRepository.findAll();
    }

    // Retrieve RouteLocation by ID
    public Optional<RouteLocation> getRouteLocationById(Long id) {
        return routeLocationRepository.findById(id);
    }

    public List<RouteLocation> findByLocationName(String location) {
        return routeLocationRepository.findByLocationName(location);
    }

    // Delete RouteLocation by ID
    public void deleteRouteLocationById(Long id) {
        routeLocationRepository.deleteById(id);
    }
}
