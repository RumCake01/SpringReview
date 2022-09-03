package com.example.repository;

import com.example.entity.Topic;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,Long> {
}
