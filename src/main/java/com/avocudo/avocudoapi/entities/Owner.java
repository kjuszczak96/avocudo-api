package com.avocudo.avocudoapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Entity(name = "Owner")
@Table(name = "owner")
@Data
public class Owner extends User {
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "owner")
    @Column(name = "restaurant_chains")
    List<RestaurantChain> restaurantChains = new ArrayList<RestaurantChain>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "owner")
    @Column(name = "restaurans")
    List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public Owner() {
        type = "owner";
    }
}