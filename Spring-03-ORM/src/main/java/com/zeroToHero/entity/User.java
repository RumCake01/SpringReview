package com.zeroToHero.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User extends  BaseEntity{

    private String name;
    private String lastName;
    private String program;
    //private Role role;



}
