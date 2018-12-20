package com.avocudo.avocudoapi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "owner")
@EqualsAndHashCode(callSuper=true)
@Data
public class Owner extends User{
    @Column(name = "restaurant_chains", nullable = false)
    private String restaurantChains;
}