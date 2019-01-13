package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.RestaurantChain;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantChainRepo extends JpaRepository<RestaurantChain, Long> {
    
}