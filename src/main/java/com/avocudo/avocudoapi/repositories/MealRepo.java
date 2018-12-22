package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Meal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepo extends CrudRepository<Meal, Long> {
    
}