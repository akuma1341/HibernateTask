package com.example.hibernatetask.strategies.first.repositories;

import com.example.hibernatetask.strategies.first.entities.Motorcycle;
import org.springframework.data.repository.CrudRepository;

public interface MotorcyclesRepository extends CrudRepository<Motorcycle, Integer> {
}
