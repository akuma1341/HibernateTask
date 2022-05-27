package com.example.hibernatetask.strategies.second.repositories;

import com.example.hibernatetask.strategies.second.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepository extends CrudRepository<Student, Integer> {
}
