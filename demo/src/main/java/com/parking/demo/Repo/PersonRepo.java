// PersonRepo.java
package com.parking.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.parking.demo.Entities.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {
}