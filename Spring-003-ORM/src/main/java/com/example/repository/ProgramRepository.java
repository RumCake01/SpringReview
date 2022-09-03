package com.example.repository;

import com.example.entity.Program;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program,Long> {
}


