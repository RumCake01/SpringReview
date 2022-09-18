package com.example.repository;

import com.example.entity.Subject;
import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject,Long> {

    // find all subjects in specific program
    //  @Query("Select u from User u where u.lastName LIKE ?1 and u.firstName like ?2 and u.email like?3")
    //    List<User> getUserBy(String one, String two, String net);


    // Derived
    List<Subject> findAllByProgram_ProgramName(String programName);

    // JPQL using Objects
    // find all subject names/title for one program

    @Query("SELECT s.title FROM Subject s where s.program.programName = ?1")
    List<String> findAllByProgram(@Param("programName") String programName);


    Integer countSubjectsByProgram_ProgramName(String programName);



}
