package com.example.demoProject.controller;

import com.example.demoProject.model.Airport;
import com.example.demoProject.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AirportController {
    @Autowired
    private AirportService airportService;

    //GetAll
    @GetMapping("/airport")
    public List<Airport> getAirports()
    {
        return airportService.getAirports();
    }
    //GetById
    @GetMapping("/airport/{id}")
    public Airport getAirportById(@PathVariable("id") Long id)
    {
        return airportService.getAirportById(id);
    }
    //CreateAirport
    @PostMapping("/airport")
    public Airport crateAirport(@RequestBody Airport airport)
    {
        return airportService.createAirport(airport);
    }
    //UpdateAirport
    @PutMapping("/airport/{id}")
    public Airport updateAirport(@PathVariable Long id, @RequestBody Airport airport)
    {
        airport.setId(id);
        return airportService.updateAirport(airport);
    }
    //DeleteAirport
    @DeleteMapping("/airport")
    public void deleteAirport(@RequestParam("id") Long id)
    {
        airportService.deleteAirport(id);
    }
}
