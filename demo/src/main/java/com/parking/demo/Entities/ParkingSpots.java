// ParkingSpots.java
package com.parking.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkingSpots {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long spotId;


private String location;

// Getters and setters.
public Long getSpotId() {
    return spotId;
}

public void setSpotId(Long spotId) {
    this.spotId = spotId;
}

public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}
}