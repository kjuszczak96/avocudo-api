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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity(name = "Report")
@Table(name = "report")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class Report {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private RegularUser sender;

    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
}