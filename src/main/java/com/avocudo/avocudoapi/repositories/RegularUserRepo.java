package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.RegularUser;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RegularUserRepo extends JpaRepository<RegularUser, Long> {
    
}