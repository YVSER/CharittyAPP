package com.example.users_ms.controllers;

import com.example.users_ms.entities.User;
import com.example.users_ms.repos.UserRep;
import com.example.users_ms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/listUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/creatuser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
    }
}
