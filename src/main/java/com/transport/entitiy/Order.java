package com.transport.entitiy;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int orderId;
    private String clientName;
    private String origin;
    private String destination;
    private double freightWeight;
    private String status;
    private String commissionAmount;
    //=======================
    private String approvedBy;
    private String clearance;
    private String incharge;

    @ManyToOne
    @JoinColumn(name = "truck_id") // Foreign key column in the "orders" table
    private Trucks assignedTruck;

    @ManyToOne
    @JoinColumn(name = "driver_id") // Foreign key column in the "orders" table
    private Driver assignedDriver;

    }

