package com.example.hibernatetask.strategies.second.repositories;

import com.example.hibernatetask.strategies.second.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeachersRepository extends CrudRepository<Teacher, Integer> {
}
