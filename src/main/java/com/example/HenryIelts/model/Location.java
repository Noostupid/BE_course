package com.example.HenryIelts.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "Location")

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String name;

    @Column(length = 200)
    private String address;
}
