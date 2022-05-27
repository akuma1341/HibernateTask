package com.example.hibernatetask.strategies.first.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
@Data
@EqualsAndHashCode(callSuper = true)
public class Car extends Vehicle {

    @Column(name = "on_petrol")
    private boolean runOnPetrol;
}
