package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Meal;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MealRepo extends JpaRepository<Meal, Long> {
    
}