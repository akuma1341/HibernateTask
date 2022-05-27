package com.example.hibernatetask.strategies.first.repositories;

import com.example.hibernatetask.strategies.first.entities.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarsRepository extends CrudRepository<Car, Integer> {
}
