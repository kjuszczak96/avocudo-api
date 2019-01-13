package com.avocudo.avocudoapi.rest;

import com.avocudo.avocudoapi.dto.UserDto;
import com.avocudo.avocudoapi.entities.User;
import com.avocudo.avocudoapi.entities.RegularUser;;
import com.avocudo.avocudoapi.entities.Owner;
import com.avocudo.avocudoapi.repositories.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;
    
    @PostMapping("/regularUsers")
    public User registerNewRegularUser(@RequestBody UserDto userDto) {
        User user = new RegularUser();
        user.setAvatarUrl(userDto.getAvatarUrl());
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userRepo.save(user);
    }

    @PostMapping("/owners")
    public User registerNewOwner(@RequestBody UserDto userDto) {
        User user = new Owner();
        user.setAvatarUrl(userDto.getAvatarUrl());
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userRepo.save(user);
    }
}