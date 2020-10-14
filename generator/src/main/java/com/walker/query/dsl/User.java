package com.walker.query.dsl;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private Boolean disabled;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
    private Set<BlogPost> blogPosts = new HashSet<BlogPost>(0);

}
