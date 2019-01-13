package com.avocudo.avocudoapi.repositories;

import java.util.List;

import com.avocudo.avocudoapi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    List<User> findByUsername(String username);
}