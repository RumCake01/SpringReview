package com.example.bootstrap;

import com.example.entity.User;
import com.example.repository.*;
import org.springframework.boot.CommandLineRunner;
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

        List <User> usersByLastName = userRepository.findByLastName("Smith");
        System.out.println("test");
        usersByLastName.stream().forEach(System.out::println);
        List <User> usersByFirstName = userRepository.findByFirstName("jenna");
        usersByFirstName.stream().forEach(System.out::println);

        List<User> userBySalaryAndDescription= userRepository.findByRole_DescriptionAndRole_Salary("Developer", 200000);
        userBySalaryAndDescription.stream().forEach(System.out::println);
    }



}
