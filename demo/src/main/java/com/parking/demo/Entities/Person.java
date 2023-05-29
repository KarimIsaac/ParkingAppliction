// Person.java
package com.parking.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long personId;


private String firstName;

private String lastName;

@OneToMany(mappedBy = "owner")
private List<Car> cars;

// Getters and setters.
public Long getPersonId() {
    return personId;
}

public void setPersonId(Long personId) {
    this.personId = personId;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public List<Car> getCars() {
    return cars;
}

public void setCars(List<Car> cars) {
    this.cars = cars;
}
}