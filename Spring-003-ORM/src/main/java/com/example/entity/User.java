package com.example.entity;

import com.example.enums.UserStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private Boolean enabled;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;
    @OneToOne
    @JoinColumn(name = "r_id" ) //reference to the role_id
    private Role role;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    @JoinTable(name = "user_prog_rel",
            joinColumns= @JoinColumn(name = "progr_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id" ))
    private List <Program> program;// we created a list here because we pass programs as a list and one student enrolled in many programs






}
