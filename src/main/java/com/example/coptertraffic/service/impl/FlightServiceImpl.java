package com.example.coptertraffic.service.impl;

import com.example.coptertraffic.model.Flight;
import com.example.coptertraffic.repository.FlightRepository;
import com.example.coptertraffic.service.FlightService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {
    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight getById(Long id) {
        return flightRepository.getById(id);
    }

    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        flightRepository.deleteById(id);
    }
}
