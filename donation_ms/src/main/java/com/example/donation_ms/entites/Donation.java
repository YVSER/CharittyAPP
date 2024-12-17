package com.example.donation_ms.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String fullName;
    private Long organisationId;
    private String organisationName;
    private Double amount;
    @Transient
    private OrganisationEntity Oe;
    @Transient
    private UserEntity Ue;
}
