package com.example.HenryIelts.model;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Registration")

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @Column(name = "full_name",columnDefinition="NVARCHAR(200)")
    private String fullName;

    @Column(name = "email",length = 100)
    private String email;

    @Column(name = "phone",length = 20)
    private String phone;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

    @Column(name = "created_at")
    private Date createdAt;

}
