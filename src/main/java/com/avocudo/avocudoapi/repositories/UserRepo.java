package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    
}