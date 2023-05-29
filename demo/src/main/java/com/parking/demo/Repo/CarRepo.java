package com.parking.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.demo.Entities.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
}