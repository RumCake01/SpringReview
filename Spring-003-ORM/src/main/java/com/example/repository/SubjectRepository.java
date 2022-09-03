package com.example.repository;

import com.example.entity.Subject;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
