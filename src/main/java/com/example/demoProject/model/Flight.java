package com.example.demoProject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "departureAirport")
    private String DepartureAirport;
    @Column(name = "arrivalAirport")
    private String ArrivalAirport;
    @Column(name = "departureDate")
    private String DepartureDate;
    @Column(name = "arrivalDate")
    private String ArrivalDate;
    @Column(name = "price")
    private double Price;
}
