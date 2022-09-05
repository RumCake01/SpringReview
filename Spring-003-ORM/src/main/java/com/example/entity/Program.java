package com.example.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="programs")
public class Program extends BaseEntity{

    @OneToMany(mappedBy = "program")
    private List<Subject> subject;
    private Long studyProgress;
    private Long duration;
    private String programName;


    @ManyToMany(mappedBy = "programList")
    private List<User> userList;


}
