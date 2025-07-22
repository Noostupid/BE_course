package com.example.HenryIelts.repository;

import com.example.HenryIelts.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {

}
