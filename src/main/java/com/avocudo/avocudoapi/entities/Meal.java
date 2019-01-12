package com.avocudo.avocudoapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Meal")
@Table(name = "meal")
@Data
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "restaurant_address", nullable = false)
    private String restaurantAddress;

    @Column(name = "restaurant_city", nullable = false)
    private String restaurantCity;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private Float price;

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "meal_ingredient", joinColumns = @JoinColumn(name = "meal_id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    @Column(name = "restaurant_chains")
    List<Ingredient> ingredients = new ArrayList<Ingredient>();

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "meal")
    @Column(name = "reports")
    List<Report> reports = new ArrayList<Report>();

    @OneToMany(mappedBy = "meal")
    @Column(name = "ratings")
    List<Rating> ratings = new ArrayList<Rating>();

    @OneToMany(mappedBy = "meal")
    @Column(name = "comments")
    List<Comment> comments = new ArrayList<Comment>();

    @Column(name = "image_url")
    private String imageUrl;
}