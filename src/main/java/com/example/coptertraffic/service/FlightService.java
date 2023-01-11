package com.example.coptertraffic.service;

import com.example.coptertraffic.model.Flight;
import java.util.List;

public interface FlightService {
    Flight save(Flight flight);

    Flight getById(Long id);

    List<Flight> findAll();

    void deleteById(Long id);
}
