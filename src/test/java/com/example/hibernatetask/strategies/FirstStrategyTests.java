package com.example.hibernatetask.strategies;

import com.example.hibernatetask.strategies.first.entities.Car;
import com.example.hibernatetask.strategies.first.entities.Motorcycle;
import com.example.hibernatetask.strategies.first.entities.Vehicle;
import com.example.hibernatetask.strategies.first.repositories.CarsRepository;
import com.example.hibernatetask.strategies.first.repositories.MotorcyclesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FirstStrategyTests {

    @Autowired
    private CarsRepository carsRepository;

    @Autowired
    private MotorcyclesRepository motorcyclesRepository;

    @Test
    void givenVehicles_whenCompare_thenOk() {
        Iterable<Car> cars = carsRepository.findAll();
        Iterable<Motorcycle> motorcycles = motorcyclesRepository.findAll();
        List<Vehicle> vehicles = new ArrayList<>();

        cars.forEach(vehicles::add);
        motorcycles.forEach(vehicles::add);

        int firstCarId = vehicles.get(0).getId();
        int firstMotorcycleId = vehicles.get(10).getId();

        assertEquals(20, vehicles.size());
        assertEquals(1, firstCarId);
        assertEquals(1, firstMotorcycleId);
    }
}
