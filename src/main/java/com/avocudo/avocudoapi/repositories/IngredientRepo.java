package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Ingredient;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends CrudRepository<Ingredient, Long> {
    
}