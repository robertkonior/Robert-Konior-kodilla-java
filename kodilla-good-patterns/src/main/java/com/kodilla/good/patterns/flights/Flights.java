package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class Flights {

    String departureAirport;
    String arrivalAirport;

    public Flights(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public void addFlight(String departureAirport, String arrivalAirport) {
        Set<Flights> flights = new HashSet<>();


    }



}
