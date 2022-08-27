package com.zeroToHero.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Role extends BaseEntity{

    private String description; // devs, mentors, admins,




}
