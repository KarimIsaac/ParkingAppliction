// ParkingEvent.java
package com.parking.demo.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;

@Entity
public class ParkingEvent {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long eventId;


private Instant startTime;

private Instant endTime;

// Getters and setters.
public Long getEventId() {
    return eventId;
}

public void setEventId(Long eventId) {
    this.eventId = eventId;
}

public Instant getStartTime() {
    return startTime;
}

public void setStartTime(Instant startTime) {
    this.startTime = startTime;
}

public Instant getEndTime() {
    return endTime;
}

public void setEndTime(Instant endTime) {
    this.endTime = endTime;
}
}