// ParkingEventRepo.java
package com.parking.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.demo.Entities.ParkingEvent;

public interface ParkingEventRepo extends JpaRepository<ParkingEvent, Long> {
}