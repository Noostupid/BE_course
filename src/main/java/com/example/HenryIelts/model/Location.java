package com.example.HenryIelts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

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

    @OneToMany (mappedBy = "location")
    @JsonIgnore
    private List<Schedule> schedules;
}
