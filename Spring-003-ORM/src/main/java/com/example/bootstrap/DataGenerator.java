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


    }



}
