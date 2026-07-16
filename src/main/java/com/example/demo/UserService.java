package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Read All
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Read One
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    // Update
    public User updateUser(int id, User updatedUser) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setDepartment(updatedUser.getDepartment());
            user.setSalary(updatedUser.getSalary());

            return userRepository.save(user);
        }

        return null;
    }

    // Delete
    public String deleteUser(int id) {

        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User deleted successfully.";
        }

        return "User not found.";
    }
}