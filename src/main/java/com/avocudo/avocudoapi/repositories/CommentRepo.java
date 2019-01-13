package com.avocudo.avocudoapi.repositories;

import com.avocudo.avocudoapi.entities.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
    
}