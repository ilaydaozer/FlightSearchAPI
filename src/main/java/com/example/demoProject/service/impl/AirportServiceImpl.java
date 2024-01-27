package com.example.demoProject.service.impl;

import com.example.demoProject.model.Airport;
import com.example.demoProject.repository.AirportRepository;
import com.example.demoProject.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AirportServiceImpl implements AirportService {
    @Autowired
    private AirportRepository airportRepository;
    @Override
    public List<Airport> getAirports() {
       return airportRepository.findAll();
    }

    @Override
    public Airport getAirportById(Long id) {
        Optional<Airport> airport = airportRepository.findById(id);
        if (airport.isPresent()){
            return airport.get();
        }
        throw new RuntimeException("Airport is not found for the id "+id);
    }

    @Override
    public Airport createAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public Airport updateAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }

}
