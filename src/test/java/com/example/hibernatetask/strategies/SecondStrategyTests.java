package com.example.hibernatetask.strategies;

import com.example.hibernatetask.strategies.second.entities.Person;
import com.example.hibernatetask.strategies.second.entities.Student;
import com.example.hibernatetask.strategies.second.entities.Teacher;
import com.example.hibernatetask.strategies.second.repositories.StudentsRepository;
import com.example.hibernatetask.strategies.second.repositories.TeachersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SecondStrategyTests {

    @Autowired
    private StudentsRepository studentsRepository;

    @Autowired
    private TeachersRepository teachersRepository;

    @Test
    void givenPersons_whenCompare_thenOk() {
        Iterable<Student> students = studentsRepository.findAll();
        Iterable<Teacher> teachers = teachersRepository.findAll();
        List<Person> people = new ArrayList<>();

        students.forEach(people::add);
        teachers.forEach(people::add);

        Teacher teacher = (Teacher) people.get(5);
        List<Long> expectedPhoneNumbers = List.of(297896541L, 335623124L, 449864312L);

        assertEquals(10, people.size());
        assertEquals("John", people.get(0).getFirstName());
        assertTrue(teacher.isOnVocation());
        assertIterableEquals(expectedPhoneNumbers, teacher.getPhoneNumbers());
    }
}
