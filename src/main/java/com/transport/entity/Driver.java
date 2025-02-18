package com.transport.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver")
public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String driverName;
    private String driverNumber;
}
