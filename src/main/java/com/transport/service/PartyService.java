package com.transport.service;

import com.transport.entitiy.Party;
import com.transport.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartyService {

    private final PartyRepository partyRepository;

    @Autowired
    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    // Create or Update Party
    public Party saveParty(Party party) {
        return partyRepository.save(party);
    }

    // Get All Parties
    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    // Get Party by ID
    public Optional<Party> getPartyById(Long id) {
        return partyRepository.findById(id);
    }

    // Delete Party by ID
    public void deleteParty(Long id) {
        partyRepository.deleteById(id);
    }
}
