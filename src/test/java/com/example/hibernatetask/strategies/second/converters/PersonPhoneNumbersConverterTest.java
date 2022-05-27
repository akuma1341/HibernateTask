package com.example.hibernatetask.strategies.second.converters;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonPhoneNumbersConverterTest {

    @Test
    void convertToDatabaseColumn() {
        List<Long> phoneNumbers = List.of(291234567L, 332345678L, 443456789L);

        PersonPhoneNumbersConverter converter = new PersonPhoneNumbersConverter();
        String generatedDBColumn = converter.convertToDatabaseColumn(phoneNumbers);

        assertEquals("291234567, 332345678, 443456789", generatedDBColumn);
    }

    @Test
    void convertToEntityAttribute() {
        String dbPhoneNumbers = "299876543, 338765432, 447654321";

        PersonPhoneNumbersConverter converter = new PersonPhoneNumbersConverter();
        List<Long> generatedPhoneNumbers = converter.convertToEntityAttribute(dbPhoneNumbers);

        assertNotNull(generatedPhoneNumbers);
        assertIterableEquals(List.of(299876543L, 338765432L, 447654321L), generatedPhoneNumbers);
    }
}