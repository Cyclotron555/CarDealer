package com.CarDealer.demo.controllers;

import com.CarDealer.demo.models.Car;
import com.CarDealer.demo.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    // Endpoint to find a car by model name
    @GetMapping("/model/{model}")
    public String getCarByModel(@PathVariable String model) {
        Car car = carService.getCarByModel(model);
        if (car != null) {
            return "Found car: " + car.toString();
        } else {
            return "Car not found for model: " + model;
        }
    }

    // Endpoint to find a car by ID
    @GetMapping("/{id}")
    public String getCarById(@PathVariable Long id) {
        Car car = carService.getCarById(id);
        if (car != null) {
            return "Found car: " + car.toString();
        } else {
            return "Car not found with ID: " + id;
        }
    }
}
