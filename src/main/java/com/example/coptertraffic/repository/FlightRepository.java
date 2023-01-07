package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
