package com.example.hibernatetask.strategies.third.repositories;

import com.example.hibernatetask.strategies.third.entities.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammersRepository extends CrudRepository<Programmer, Integer> {
}
