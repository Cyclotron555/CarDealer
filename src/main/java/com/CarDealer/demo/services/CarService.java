package com.CarDealer.demo.services;

import com.CarDealer.demo.models.Car;
import com.CarDealer.demo.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // Find a car by model name
    public Car getCarByModel(String model) {
        Optional<Car> car = carRepository.findByModel(model);
        return car.orElse(null); // Return the car if found, otherwise null
    }

    // Find a car by ID
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
}
