package com.example.demoProject.service;

import com.example.demoProject.model.Airport;

import java.util.List;

public interface AirportService {
    List<Airport> getAirports();
    Airport getAirportById(Long id);
    Airport createAirport(Airport airport);
    Airport updateAirport(Airport airport);
    void deleteAirport(Long id);
}
