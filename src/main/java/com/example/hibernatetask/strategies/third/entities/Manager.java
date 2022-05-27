package com.example.hibernatetask.strategies.third.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MANAGER")
@Data
@EqualsAndHashCode(callSuper = true)
public class Manager extends Employee {

    @Column(name = "bonus")
    private double bonus;
}
