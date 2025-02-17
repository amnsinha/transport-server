package com.transport.service;

import com.transport.entitiy.User;
import com.transport.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create or Update User
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Get User by Email
    public Optional<User> getUserByEmail(String email) {
        return Optional.ofNullable(userRepository.findByEmailId(email));
    }

    // Delete User by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
