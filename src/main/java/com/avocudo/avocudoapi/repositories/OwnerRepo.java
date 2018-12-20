package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Owner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * OwnerRepo
 */
@Repository
public interface OwnerRepo extends CrudRepository<Owner, Long> {
    
}