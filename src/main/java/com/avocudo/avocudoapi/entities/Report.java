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


@Entity(name = "Report")
@Table(name = "report")
@Data
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
    @JoinColumn(name = "sender_id", nullable = false)
    private RegularUser sender;

    @ManyToOne
    @JoinColumn(name = "meal_id", nullable = false)
    private Meal meal;
}