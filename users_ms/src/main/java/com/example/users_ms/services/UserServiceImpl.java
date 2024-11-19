package com.example.users_ms.services;

import com.example.users_ms.entities.User;
import com.example.users_ms.repos.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRep userRep;

    @Override
    public List<User> getAllUsers() {
        return userRep.findAll();
    }

    @Override
    public User createUser(User user) {
        return userRep.save(user);
    }

    @Override
    public User updateUser(User user) {
        return userRep.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRep.deleteById(id);
    }
}
