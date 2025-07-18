package com.example.HenryIelts.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Banner")
@Data
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String title;

    @Column
    private String content;

    @Column
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
