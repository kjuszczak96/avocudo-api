package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Restaurant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends CrudRepository<Restaurant, Long> {
    
}