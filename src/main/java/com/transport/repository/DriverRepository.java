package com.transport.repository;

import com.transport.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    // You can add custom queries here if needed
    Driver findByDriverNumber(String driverNumber);  // Example custom method
}

