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
@Table(name = "party_details")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partyName;
    private String ownerNumber;
    private String ownerName;
}

