package com.avocudo.avocudoapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity(name = "Comment")
@Table(name = "comment")
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @JsonIgnoreProperties("comments")
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private RegularUser sender;

    @JsonIgnoreProperties("comments")
    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
}