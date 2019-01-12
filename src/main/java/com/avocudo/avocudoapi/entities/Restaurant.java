package com.avocudo.avocudoapi.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Restaurant")
@Table(name = "restaurant")
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "name")
    private String name;

    @Column(name = "open_hour")
    private Date openHour;

    @Column(name = "close_hour")
    private Date closeHour;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @ManyToOne
    @JoinColumn(name = "restaurant_chain_id")
    private RestaurantChain restaurant_chain;

    @OneToMany(mappedBy = "restaurant")
    @Column(name = "meals")
    List<Meal> meals = new ArrayList<Meal>();

    @Column(name = "image_url")
    private String imageUrl;
}