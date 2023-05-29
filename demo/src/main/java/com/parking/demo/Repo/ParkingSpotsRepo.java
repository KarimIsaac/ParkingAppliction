// ParkingSpotsRepo.java
package com.parking.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.demo.Entities.ParkingSpots;

public interface ParkingSpotsRepo extends JpaRepository<ParkingSpots, Long> {
}