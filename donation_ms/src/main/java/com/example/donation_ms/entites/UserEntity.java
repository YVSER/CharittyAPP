package com.example.donation_ms.entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class UserEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private Date dateOfBirth;
}
