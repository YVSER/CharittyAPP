package com.example.donation_ms.repos;


import com.example.donation_ms.entites.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepo extends JpaRepository<Donation, Long> {
}
