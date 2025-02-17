package com.transport.controller;

import com.transport.entitiy.RouteLocation;
import com.transport.service.RoutesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/route-locations")
public class RouteLocationController {

    @Autowired
    private RoutesService routeLocationService;

    // Create or Update RouteLocation
    @PostMapping
    public ResponseEntity<RouteLocation> saveRouteLocation(@RequestBody RouteLocation routeLocation) {
        RouteLocation savedLocation = routeLocationService.saveRouteLocation(routeLocation);
        return ResponseEntity.ok(savedLocation);
    }

    // Get all RouteLocations
    @GetMapping
    public ResponseEntity<List<RouteLocation>> getAllRouteLocations() {
        List<RouteLocation> locations = routeLocationService.getAllRouteLocations();
        return ResponseEntity.ok(locations);
    }

    // Get RouteLocation by ID
    @GetMapping("/{id}")
    public ResponseEntity<RouteLocation> getRouteLocationById(@PathVariable Long id) {
        Optional<RouteLocation> location = routeLocationService.getRouteLocationById(id);
        return location.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{location}")
    public ResponseEntity<List<RouteLocation>> getRouteLocationById(@PathVariable String location) {
        List<RouteLocation> locationsList = routeLocationService.findByLocationName(location);
        return ResponseEntity.ok(locationsList);
    }

    // Delete RouteLocation by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRouteLocationById(@PathVariable Long id) {
        routeLocationService.deleteRouteLocationById(id);
        return ResponseEntity.noContent().build();
    }
}
