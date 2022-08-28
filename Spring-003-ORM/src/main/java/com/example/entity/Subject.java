
package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name="subjects")
public class Subject extends BaseEntity{

    private String title; // title of the subject
    private Long subjectDuration; // hours of the subject
    private Long subjectStudyProgress; // how much time has student completed from this subject
  //  private Topic topic; // each subject will have topics covered
}


