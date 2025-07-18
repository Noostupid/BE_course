package com.example.HenryIelts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,unique = true, nullable = false)
    private String userName;

    @Column(length = 255,unique = true, nullable = false)
    private String password;

    @Column(length = 255,unique = true, nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(unique = true, nullable = false)
    private Date createdAt;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Banner> banners;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Post> posts;
}
