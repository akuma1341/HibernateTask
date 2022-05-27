package com.example.hibernatetask.strategies.first.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "motorcycles")
@Data
@EqualsAndHashCode(callSuper = true)
public class Motorcycle extends Vehicle {

    @Column(name = "has_sidecar")
    private boolean hasSideCar;
}
