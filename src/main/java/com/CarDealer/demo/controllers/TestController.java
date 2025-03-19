package com.CarDealer.demo.controllers;


import com.CarDealer.demo.services.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired // Injects the Driver Bean automatically
    private Driver driver;

    @GetMapping("/test-drive")
    public String testDrive(){
        driver.drive(); //calls the drive method
        return "Test drive is complete! Check console output";

    }
}
