package com.example.users_ms.services;

import com.example.users_ms.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getAllUsers();
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long id);


}
