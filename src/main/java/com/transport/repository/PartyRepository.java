package com.transport.repository;

import com.transport.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PartyRepository extends JpaRepository<Party, Long> {
    // Custom query methods can be added if needed

    List<Party> findByPartyName(String truckNumber);
}
