package com.example.hibernatetask.strategies;

import com.example.hibernatetask.strategies.third.entities.Programmer;
import com.example.hibernatetask.strategies.third.repositories.EmployeesRepository;
import com.example.hibernatetask.strategies.third.repositories.ProgrammersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ThirdStrategyTests {

    @Autowired
    private ProgrammersRepository programmersRepository;

    @Autowired
    private EmployeesRepository employeesRepository;

    @Test
    void givenProgrammer_whenSaveEmployee_thenSaveSuccessful() {
        Programmer programmer = new Programmer();
        programmer.setSalary(150);
        programmer.setLanguage("C#");
        employeesRepository.save(programmer);

        Programmer cProgrammer = (Programmer) employeesRepository.findById(11).orElse(null);

        assertNotNull(cProgrammer);
        assertEquals("C#", cProgrammer.getLanguage());
    }
}
