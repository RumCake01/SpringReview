package com.example.entity;

import com.example.enums.UserStatus;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Where(clause= "is_deleted=false")
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


    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "program_id" )
    private Program program;


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", password='" + password + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
