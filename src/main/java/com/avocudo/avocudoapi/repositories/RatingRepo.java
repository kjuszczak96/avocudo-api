package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Rating;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepo extends CrudRepository<Rating, Long> {
    
}