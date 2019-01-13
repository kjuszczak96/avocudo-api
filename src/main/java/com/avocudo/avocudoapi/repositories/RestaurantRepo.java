package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Restaurant;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    
}