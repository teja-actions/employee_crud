package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Usercontroller {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable int id,
                           @RequestBody User updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }
}