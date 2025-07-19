package com.example.HenryIelts.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import jakarta.persistence.*;

import java.util.List;

@Data
@Entity
@Table

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",columnDefinition = "NVARCHAR(100)")
    private String name;

    @Column(name = "bio", columnDefinition = "NVARCHAR(MAX)")
    private String bio;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "active")
    private Boolean active = true;

    @OneToMany(mappedBy = "teacher")
    @JsonIgnore
    private List<Schedule> shedules;
}
