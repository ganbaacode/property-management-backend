package com.example.property_management.controllers;

import com.example.property_management.entity.User;
import com.example.property_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {


    private final UserRepository userRepository;

    @GetMapping
    private List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
