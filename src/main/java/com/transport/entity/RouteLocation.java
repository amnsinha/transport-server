package com.transport.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "routes")
public class RouteLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String locationName;
}

