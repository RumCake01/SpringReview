package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="roles")
public class Role {

    private String description;
    private Boolean enabled;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
