package com.example.HenryIelts.repository;

import com.example.HenryIelts.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepo extends JpaRepository<Registration, Long> {
}
