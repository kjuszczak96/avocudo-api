package com.avocudo.avocudoapi.rest;

import com.avocudo.avocudoapi.repositories.MealRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.avocudo.avocudoapi.entities.Meal;

@RestController
public class RestMealController {

    @Autowired
    private MealRepo mealRepo;
    
    @GetMapping("/meals/{mealId}")
    public Optional<Meal> getMeal(@PathVariable Long mealId) {
        return mealRepo.findById(mealId);
    }
}