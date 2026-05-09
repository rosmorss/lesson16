package com.impact.lessons.services;

import com.impact.lessons.database.UserStore;
import com.impact.lessons.models.User;

import java.util.List;

public class UserService {

    private final UserStore userStore;

    // Constructor pentru injectarea dependenței
    public UserService(UserStore userStore) {
        this.userStore = userStore;
    }

    // Creează un nou utilizator și îl salvează în store
    public User createUser(User user) {

        User newUser = new User(
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRole()
        );

        return userStore.save(newUser);
    }

    // Returnează lista tuturor utilizatorilor
    public List<User> getAllUsers() {
        return userStore.findAll();
    }
}