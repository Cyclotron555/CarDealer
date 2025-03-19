package com.CarDealer.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    private final Vehicle vehicle;

    @Autowired
    public Driver(Vehicle vehicle){ // Spring automatically selects a Vehicle Bean
        this.vehicle = vehicle;
    }

    public void drive(){
        System.out.println("Driver is ready");
        vehicle.startEngine(); // Spring automatically selects a Vehicle Bean
    }
}
