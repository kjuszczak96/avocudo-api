package com.avocudo.avocudoapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Rating")
@Table(name = "rating")
@Data
public class Rating {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value", nullable = false)
    private Long value;

    @Column(name = "registration_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private RegularUser sender;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
}