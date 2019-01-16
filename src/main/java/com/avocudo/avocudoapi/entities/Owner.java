package com.avocudo.avocudoapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "Owner")
@Table(name = "owner")
@EqualsAndHashCode(callSuper = true)
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Owner extends User {
    @OneToMany(mappedBy = "owner")
    @Column(name = "restaurant_chains")
    List<RestaurantChain> restaurantChains = new ArrayList<RestaurantChain>();

    @OneToMany(mappedBy = "owner")
    @Column(name = "restaurans")
    List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public Owner() {
        type = "owner";
    }
}