package com.CarDealer.demo.services;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle{
    @Override
    public void startEngine(){
        System.out.println("The truck engine has started");
    }
}
