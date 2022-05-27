package com.example.hibernatetask.strategies.second.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class PersonPhoneNumbersConverter implements AttributeConverter<List<Long>, String> {

    private static final String SEPARATOR = ", ";

    @Override
    public String convertToDatabaseColumn(List<Long> phoneNumbers) {

        if (phoneNumbers == null || phoneNumbers.isEmpty()) {
            return null;
        }
        return collectPhoneNumbersToString(phoneNumbers);
    }

    @Override
    public List<Long> convertToEntityAttribute(String dbPhoneNumbers) {
        String[] numbers = dbPhoneNumbers.split(SEPARATOR);
        return Arrays.stream(numbers)
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }

    private String collectPhoneNumbersToString(List<Long> phoneNumbers) {
        return phoneNumbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(SEPARATOR));
    }
}
