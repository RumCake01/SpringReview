package com.example.entity;

import com.example.enums.UserStatus;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
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
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "r_id" ) //reference to the role_id
    private Role role;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})

    @JoinTable(name = "user_prog_rel",
            joinColumns= @JoinColumn(name = "program_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id" ))
    private List <Program> program;// we created a list here because we pass programs as a list and one student enrolled in many programs

    @ManyToMany
    @JoinTable(name = "user_program_rel",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name = "program_id"))
    private List<Program> programList;


    @Override
    public String toString() {
        return "User{" +
                "createdBy=" + createdBy +
                ", createdTime=" + createdTime +
                ", updatedBy=" + updatedBy +
                ", updatedTime=" + updatedTime +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
