package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
//    private Role role;
//    private Program program;



}
