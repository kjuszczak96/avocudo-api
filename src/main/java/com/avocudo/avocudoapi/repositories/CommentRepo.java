package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Comment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends CrudRepository<Comment, Long> {
    
}