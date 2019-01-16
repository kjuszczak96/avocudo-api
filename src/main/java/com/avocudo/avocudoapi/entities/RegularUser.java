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

@Entity(name = "RegularUser")
@Table(name = "regular_user")
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property="@id")
public class RegularUser extends User {
    @OneToMany(mappedBy = "sender")
    @Column(name = "comments")
    List<Comment> comments = new ArrayList<Comment>();

    @OneToMany(mappedBy = "sender")
    @Column(name = "reports")
    List<Report> reports = new ArrayList<Report>();

    @OneToMany(mappedBy = "sender")
    @Column(name = "ratings")
    List<Rating> ratings = new ArrayList<Rating>();

    public RegularUser() {
        type = "regular";
    }
}