package com.avocudo.avocudoapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "Ingredient")
@Table(name = "ingredient")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Ingredient {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "category", nullable = false)
    private String category;
}