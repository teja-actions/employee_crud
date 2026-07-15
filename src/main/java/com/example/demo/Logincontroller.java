package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Logincontroller {

    @Autowired
    UserRepository repo;

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        repo.save(user);  // saves to database

        return "User saved in DB";
    }
}
