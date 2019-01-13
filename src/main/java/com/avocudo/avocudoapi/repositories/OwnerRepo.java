package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

/**
 * OwnerRepo
 */
@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {
    
}