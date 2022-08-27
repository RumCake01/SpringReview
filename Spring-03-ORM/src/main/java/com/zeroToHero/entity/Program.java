package com.zeroToHero.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="programs")

@Data
@NoArgsConstructor
public class Program extends BaseEntity{

    private String title;
    private String subjects;
    private Long duration;
    private Long studyProgress;

}
