package com.transport.repository;

import com.transport.entity.RouteLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoutesRepository extends JpaRepository<RouteLocation, Long> {
    // Custom query methods can be added if needed

    List<RouteLocation> findByLocationName(String location);
}
