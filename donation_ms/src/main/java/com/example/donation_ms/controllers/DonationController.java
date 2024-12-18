package com.example.donation_ms.controllers;


import com.example.donation_ms.entites.Donation;
import com.example.donation_ms.services.DonationService;
import com.example.donation_ms.services.KafkaSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Donations")
public class DonationController {
    @Autowired
    private DonationService donationService;
    private KafkaSender kafkaSenderService;

    @RequestMapping("/getAllDonations")
    public List<Donation> getAllDonations(){
        return donationService.getAllDonations();
    }

    @RequestMapping("/getDonationById/{id}")
    public Donation getdonation(@PathVariable Long id){
        return donationService.findDonationById(id);
    }

    @PostMapping("/createDonation")
    public Donation createdonation(@RequestBody Donation org){
        return donationService.createDonation(org);
    }

    @DeleteMapping("/deleteDonationById/{id}")
    public void deleteDonationById(@PathVariable Long id){
        donationService.deleteDonationById(id);
    }
    @PostMapping("/{donationId}/notify")
    public String notifyDonation(@PathVariable Long donationId, @RequestBody String message) {
        kafkaSenderService.sendMessage(message, "donation-topic");
        return "Message sent to Kafka topic for donation ID: " + donationId;
    }
}
