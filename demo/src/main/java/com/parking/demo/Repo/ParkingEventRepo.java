// ParkingEventRepo.java
package com.parking.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.demo.Entities.ParkingEvent;

public interface ParkingEventRepo extends JpaRepository<ParkingEvent, Long> {
    List<ParkingEvent> findByPersonIdAndStatus(Long personId, String status);

    List<ParkingEvent> findByCarIdAndStatus(Long carId, String status);
    List<ParkingEvent> findByStatus(String status);

}