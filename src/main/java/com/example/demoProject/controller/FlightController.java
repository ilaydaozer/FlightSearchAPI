package com.example.demoProject.controller;

import com.example.demoProject.model.Flight;
import com.example.demoProject.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {
    @Autowired
    private FlightService flightService;
    //GetAll
    @GetMapping("/flight")
    public List<Flight> getFlights()
    {
        return flightService.getFlights();
    }
    //GetById
    @GetMapping("/flight/{id}")
    public Flight getFlightById(@PathVariable("id") Long id)
    {
        return flightService.getFlightById(id);
    }
    //CreateFlight
    @PostMapping("/flight")
    public Flight createFlight(@RequestBody Flight flight)
    {
        return flightService.createFlight(flight);
    }
    //UpdateFlight
    @PutMapping("/flight/{id}")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flight)
    {
        flight.setId(id);
        return flightService.updateFlight(flight);
    }
    @DeleteMapping("/flight")
    public void deleteFlight(@RequestParam("id") Long id)
    {
        flightService.deleteFlight(id);
    }
}
