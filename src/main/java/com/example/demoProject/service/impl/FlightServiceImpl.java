package com.example.demoProject.service.impl;

import com.example.demoProject.model.Airport;
import com.example.demoProject.model.Flight;
import com.example.demoProject.repository.FlightRepository;
import com.example.demoProject.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(Long id) {
        Optional<Flight> flight = flightRepository.findById(id);
        if(flight.isPresent())
        {
            return flight.get();
        }
        else {
            throw new RuntimeException("Flight is not found for the id "+id);
        }
    }

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
}
