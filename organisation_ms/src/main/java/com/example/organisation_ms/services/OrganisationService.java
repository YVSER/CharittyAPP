package com.example.organisation_ms.services;

import com.example.organisation_ms.entites.Organisation;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrganisationService {
    public List<Organisation> getAllOrganisations();
    public Organisation findOrganisationById(Long id);

    public Organisation createOrganisation(Organisation organisation);
    public Organisation updateOrganisation(Organisation organisation);
    public void deleteOrganisation(Long id);

}
