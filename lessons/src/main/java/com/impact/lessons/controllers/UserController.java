package com.impact.lessons.controllers;

import com.impact.lessons.models.User;
import com.impact.lessons.services.UserService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    // Constructor injection pentru UserService
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint pentru crearea unui utilizator
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    // Endpoint pentru obținerea tuturor utilizatorilor
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}