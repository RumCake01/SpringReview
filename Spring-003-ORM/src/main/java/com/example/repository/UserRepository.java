package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {


   /* List <User> findByLastName(String lastName);
    List <User> findByFirstName(String firstName);

    List<User> findByRole_DescriptionAndRole_Salary(String description, Integer salary);


    @Query("Select u from User u where u.lastName LIKE ?1 and u.firstName like ?2 and u.email like?3")
    List<User> getUserBy(String one, String two, String net);


    // Native queries


    @Query(value = "SELECT * FROM users ORDER BY users.first_name DESC ", nativeQuery = true)
    List<User> findByFirstNameNative();

    @Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery = true)
    User retrieveByEmail(@Param("email") String email);



    @Query(value = "SELECT * FROM users u JOIN program p ON u.program_id = p.id WHERE u.email = ?1", nativeQuery = true)
    List<User> findAllByUserEmail(@Param("email") String email);


    // find users who are in the program  = Java Developer Core
    //



*/




}
