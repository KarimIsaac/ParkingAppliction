package com.parking.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;

@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long carId;


@Column(nullable = false)
private String licensePlate;

@ManyToOne
@JoinColumn(name = "person_id")
private Person owner;

// Getters and setters.
public Long getCarId() {
    return carId;
}

public void setCarId(Long carId) {
    this.carId = carId;
}

public String getLicensePlate() {
    return licensePlate;
}

public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
}

public Person getOwner() {
    return owner;
}

public void setOwner(Person owner) {
    this.owner = owner;
}
}