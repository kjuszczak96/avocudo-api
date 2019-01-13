package com.avocudo.avocudoapi.rest;

import com.avocudo.avocudoapi.repositories.CommentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.avocudo.avocudoapi.entities.Comment;

@RestController
public class RestCommentController {

    @Autowired
    private CommentRepo commentRepo;
    
    @GetMapping("/allComments")
    public List<Comment> getUsers() {
        return commentRepo.findAll();
    }
}