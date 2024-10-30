package com.example.organisation_ms.repos;

import com.example.organisation_ms.entites.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepo extends JpaRepository<Organisation,Long> {
}
