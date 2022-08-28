package com.example.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="programs")
public class Program extends BaseEntity{

    //private Subject subject;
    private Long studyProgress;
    private Long duration;
}
