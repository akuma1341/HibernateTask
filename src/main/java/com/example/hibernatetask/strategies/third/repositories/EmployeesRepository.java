package com.example.hibernatetask.strategies.third.repositories;

import com.example.hibernatetask.strategies.third.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepository extends CrudRepository<Employee, Integer> {
}
