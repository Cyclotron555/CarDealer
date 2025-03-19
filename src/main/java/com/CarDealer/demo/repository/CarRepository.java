package com.CarDealer.demo.repository;

import com.CarDealer.demo.models.Car; // ✅ Correct import for Car
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional; // ✅ Required import for Optional

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByModel(String model); // ✅ Custom query method to find by model
}
