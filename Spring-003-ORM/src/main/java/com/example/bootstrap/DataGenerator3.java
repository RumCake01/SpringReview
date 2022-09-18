package com.example.bootstrap;

import com.example.entity.User;
import com.example.repository.*;

import java.util.List;

public class DataGenerator3 {

/*    private final ProgramRepository programRepository;
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

        System.out.println(" new new new  ");

        userRepository.getUserBy("Smith", "Mike", "admin@cydeo.com").stream().forEach(System.out::println);

        userRepository.findByFirstNameNative().stream().forEach(System.out::println);

        System.out.println(userRepository.retrieveByEmail("root@cydeo.com"));

        System.out.println("newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");

        userRepository.findAllByUserEmail("root@cydeo.com").stream().forEach(System.out::println);

    }


*/
}

