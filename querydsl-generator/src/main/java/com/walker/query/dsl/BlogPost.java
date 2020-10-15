package com.walker.query.dsl;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
public class BlogPost {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String body;

    @ManyToOne
    private User user;

    // getters and setters

}
