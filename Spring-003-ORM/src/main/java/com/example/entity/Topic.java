package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="topics")
public class Topic extends BaseEntity{

    private String topicTitle;
}
