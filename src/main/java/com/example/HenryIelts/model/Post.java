package com.example.HenryIelts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String title;

    @Column(length = 150)
    private String slug;

    @Column
    private String content;

    @Column
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
