package com.example.repository;

import com.example.entity.Program;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProgramRepository extends JpaRepository<Program,Long> {


    // in programs, find all users who fistname = Rumi






}


