// ApiController.java
package com.parking.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.parking.demo.Entities.Car;
import com.parking.demo.Entities.ParkingEvent;
import com.parking.demo.Entities.ParkingSpots;
import com.parking.demo.Entities.Person;
import com.parking.demo.Repo.CarRepo;
import com.parking.demo.Repo.ParkingEventRepo;
import com.parking.demo.Repo.ParkingSpotsRepo;
import com.parking.demo.Repo.PersonRepo;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ParkingController {
@Autowired
PersonRepo personRepo;


@Autowired
CarRepo carRepo;

@Autowired
ParkingSpotsRepo parkingSpotsRepo;

@Autowired
ParkingEventRepo parkingEventRepo;

@GetMapping("/")
public String getPage() {
    return "Welcome To the Parking ";
}

// Get all persons.
@GetMapping("/persons")
public List<Person> getPerson() {
    return personRepo.findAll();
}

// Add a person.
@PostMapping("/persons")
public String addPerson(@RequestBody Person person) {
    personRepo.save(person);
    return "Person saved !";
}

// Get all cars.
@GetMapping("/cars")
public List<Car> getCars() {
    return carRepo.findAll();
}

// Add a car.
@PostMapping("/cars")
public String addCar(@RequestBody Car car) {
    carRepo.save(car);
    return "Car saved!";
}

// Get all parking events.
@GetMapping("/parkingevents")
public List<ParkingEvent> getParkingEvents() {
    return parkingEventRepo.findAll();
}

// Add a parking event.
@PostMapping("/parkingevents")
public String addParkingEvent(@RequestBody ParkingEvent parkingEvent) {
    parkingEventRepo.save(parkingEvent);
    return "Parking event saved!";
}

// Get all parking spots.
@GetMapping("/parkingspots")
public List<ParkingSpots> getParkingSpots() {
    return parkingSpotsRepo.findAll();
}

// Add a parking spot.
@PostMapping("/parkingspots")
public String addParkingSpot(@RequestBody ParkingSpots parkingSpot) {
    parkingSpotsRepo.save(parkingSpot);
    return "Parking spot saved!";
}

}