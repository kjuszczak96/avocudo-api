package com.avocudo.avocudoapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private RegularUser sender;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
}