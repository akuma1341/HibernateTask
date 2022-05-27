package com.example.hibernatetask.strategies.second.entities;

import com.example.hibernatetask.strategies.second.converters.PersonPhoneNumbersConverter;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Convert(converter = PersonPhoneNumbersConverter.class)
    private List<Long> phoneNumbers;
}
