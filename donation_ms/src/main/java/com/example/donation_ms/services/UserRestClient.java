package com.example.donation_ms.services;

import com.example.donation_ms.entites.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("users-ms")
public interface UserRestClient {
    @GetMapping("/users/getUserById/{id}")
    UserEntity getUserById(@PathVariable long id);
}
