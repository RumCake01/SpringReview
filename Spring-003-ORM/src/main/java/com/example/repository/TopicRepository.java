package com.example.repository;

import com.example.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic,Long> {

    // find all topics which belong to specific program

    // Derived

    Integer countTopicsBySubject_Program_ProgramName(String programName);


    // return all integers
    // study progress of rumi10@gmail.com user in
    // first find topics = all topics
    //

    List<Topic> findTopicsBySubject_Program_ProgramName(String programName);


}
