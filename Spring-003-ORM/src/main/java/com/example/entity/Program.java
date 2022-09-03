package com.example.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="programs")
public class Program extends BaseEntity{

    //private Subject subject;
    private Long studyProgress;
    private Long duration;
    private String programName;

    @ManyToMany
    private List<User> user;

    @ManyToMany(mappedBy = "programList")
    private List<User> userList;


}
