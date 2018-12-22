package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.RegularUser;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegularUserRepo extends CrudRepository<RegularUser, Long> {
    
}