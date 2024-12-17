package com.example.donation_ms.services;

import com.example.donation_ms.entites.OrganisationEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("organisation-ms")
public interface OrganisationRestClient {
    @GetMapping("/organisations/getOrganisationById/{id}")
    OrganisationEntity getOrganisationById(@PathVariable long id);
}
