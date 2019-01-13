package com.avocudo.avocudoapi.rest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avocudo.avocudoapi.entities.User;
import com.avocudo.avocudoapi.entities.RegularUser;
import com.avocudo.avocudoapi.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/matchPassword")
    public boolean matchPassword(@RequestParam("username") String username, @RequestParam("password") String password) {
        boolean result = false;
        for (User user : userRepo.findByUsername(username)) {
            if (passwordEncoder.matches(password, user.getPassword())) {
                result=true;
            }
        }
        return result;
    }

    @GetMapping("/getUserByUsername")
    public Optional<User> getUserByUsername(@RequestParam("username") String username) {
        for (User user : userRepo.findByUsername(username)) {
            return userRepo.findById(user.getId());
        }
        return null;
    }
}