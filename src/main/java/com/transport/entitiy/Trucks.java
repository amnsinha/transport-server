package com.transport.entitiy;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.lang.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trucks")
public class Trucks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String truckNumber;
    private String registrationNumber;
    private String model;
    private double capacity;
    private String fuelType;
    private String status;
    private String ownerNumber;
    private String ownerName;

    private String fright;
    private boolean active;
    @ElementCollection
    @CollectionTable(name = "truck_documents", joinColumns = @JoinColumn(name = "truck_id"))
    @MapKeyColumn(name = "document_type")
    @Column(name = "document_path")
    private Map<String, String> documents; // E.g., {"Insurance": "/docs/insurance.pdf"}
    private Date nextMaintenanceDate;

    }

