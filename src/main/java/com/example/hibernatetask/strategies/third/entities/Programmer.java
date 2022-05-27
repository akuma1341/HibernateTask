package com.example.hibernatetask.strategies.third.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PROGRAMMER")
@Data
@EqualsAndHashCode(callSuper = true)
public class Programmer extends Employee {

    @Column(name = "language")
    private String language;
}
