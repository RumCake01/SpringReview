package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List <User> findByLastName(String lastName);
    List <User> findByFirstName(String firstName);

    List<User> findByRole_DescriptionAndRole_Salary(String description, Integer salary);
}