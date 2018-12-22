package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.RestaurantChain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantChainRepo extends CrudRepository<RestaurantChain, Long> {
    
}