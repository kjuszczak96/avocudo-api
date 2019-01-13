package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Ingredient;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepo extends JpaRepository<Ingredient, Long> {
    
}