package com.example.users_ms.repos;

import com.example.users_ms.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,Long> {

}
