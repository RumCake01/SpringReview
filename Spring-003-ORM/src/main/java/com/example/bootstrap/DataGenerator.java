package com.example.bootstrap;

import com.example.entity.User;
import com.example.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final ProgramRepository programRepository;
    private final RoleRepository roleRepository;
    private final SubjectRepository subjectRepository;
    private final TopicRepository topicRepository;
    private final UserRepository userRepository;

    public DataGenerator(ProgramRepository programRepository,
                         RoleRepository roleRepository,
                         SubjectRepository subjectRepository,
                         TopicRepository topicRepository,
                         UserRepository userRepository) {

        this.programRepository = programRepository;
        this.roleRepository = roleRepository;
        this.subjectRepository = subjectRepository;
        this.topicRepository = topicRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("derived queries ---------------");
        subjectRepository.findAllByProgram_ProgramName("React Developer").stream().forEach(System.out::println);

        Integer countOfSubjects = subjectRepository.countSubjectsByProgram_ProgramName("React Developer");
        System.out.println("the count of Subjects = " + countOfSubjects);

        Integer countOfTopics = topicRepository.countTopicsBySubject_Program_ProgramName("Java Developer Spring");
        System.out.println("the count of Topics = " + countOfTopics);

        System.out.println("====================");
        Long studyProgress = topicRepository.findTopicsBySubject_Program_ProgramName("Java Developer Spring").
                stream().map(topic->topic.getTopicStudyProgress()).
                reduce(Long.valueOf(0), (a, b) -> a + b);
        System.out.println(studyProgress);

        System.out.println("====================");
        System.out.println("JPQL  by Object  queries ---------------");
        subjectRepository.findAllByProgram("Java Developer Core").stream().forEach(System.out::println);





    }



}
