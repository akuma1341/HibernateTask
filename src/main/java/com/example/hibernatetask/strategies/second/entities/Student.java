package com.example.hibernatetask.strategies.second.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Data
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {

    @Column(name = "group_number")
    private String groupNumber;
}
