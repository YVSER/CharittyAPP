package com.example.organisation_ms.contollers;

import com.example.organisation_ms.entites.Organisation;
import com.example.organisation_ms.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/organisation")
public class OrganisationController {
    @Autowired
    private OrganisationService organisationService;


    @PostMapping("/creatOrganisation")
    public Organisation createUser(@RequestBody Organisation organisation) {
        return organisationService.createOrganisation(organisation);
    }
    @RequestMapping("/getOrganisationById/{id}")
    public Organisation getOrganisationById(@PathVariable Long id){
        return organisationService.findOrganisationById(id);}
    @PutMapping("/updateOrganisation")
    public Organisation updateUser(@RequestBody Organisation organisation) {
        return organisationService.updateOrganisation(organisation);
    }
    @DeleteMapping("/deleteOrganisation")
    public void deleteUser(@RequestParam("id") Long id) {
        organisationService.deleteOrganisation(id);
    }
}
