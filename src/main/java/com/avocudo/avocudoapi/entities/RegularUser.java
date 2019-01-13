package com.avocudo.avocudoapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "RegularUser")
@Table(name = "regular_user")
@Data
public class RegularUser extends User {
    @JsonIgnoreProperties("sender")
    @OneToMany(mappedBy = "sender")
    @Column(name = "comments")
    List<Comment> comments = new ArrayList<Comment>();

    @JsonIgnoreProperties("sender")
    @OneToMany(mappedBy = "sender")
    @Column(name = "reports")
    List<Report> reports = new ArrayList<Report>();

    @JsonIgnoreProperties("sender")
    @OneToMany(mappedBy = "sender")
    @Column(name = "ratings")
    List<Rating> ratings = new ArrayList<Rating>();

    public RegularUser() {
        type = "regular";
    }
}