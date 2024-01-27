package com.example.demoProject.service;

import com.example.demoProject.model.Airport;
import com.example.demoProject.model.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getFlights();
    Flight getFlightById(Long id);
    Flight createFlight(Flight flight);
    Flight updateFlight(Flight flight);
    void deleteFlight(Long id);
}
