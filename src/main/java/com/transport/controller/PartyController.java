package com.transport.controller;

import com.transport.entity.Party;
import com.transport.service.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parties")
public class PartyController {

    private final PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    // Create or Update Party
    @PostMapping
    public ResponseEntity<Party> createParty(@RequestBody Party party) {
        Party savedParty = partyService.saveParty(party);
        return new ResponseEntity<>(savedParty, HttpStatus.CREATED);
    }

    // Get All Parties
    @GetMapping
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }

    // Get Party by ID
    @GetMapping("/{id}")
    public ResponseEntity<Party> getPartyById(@PathVariable Long id) {
        Optional<Party> party = partyService.getPartyById(id);
        return party.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Delete Party by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParty(@PathVariable Long id) {
        partyService.deleteParty(id);
        return ResponseEntity.noContent().build();
    }
}
