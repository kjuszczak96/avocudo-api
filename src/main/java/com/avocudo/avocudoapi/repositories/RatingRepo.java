package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Rating;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Long> {
    
}