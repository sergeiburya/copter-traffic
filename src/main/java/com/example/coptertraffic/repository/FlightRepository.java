package com.example.coptertraffic.repository;

import com.example.coptertraffic.model.Flight;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    Flight getById(Long id);

    List<Flight> findAllBy();
}
