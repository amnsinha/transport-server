package com.transport.repository;

import com.transport.entity.Trucks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrucksRepository extends JpaRepository<Trucks, Long> {
    // Custom query methods can be added if needed

    List<Trucks> findByTruckNumber(String truckNumber);
}
