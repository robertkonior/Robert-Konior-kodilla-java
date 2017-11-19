package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class Flights {

    String departureAirport;
    String arrivalAirport;
    private Set<Flights> flights = new HashSet<>();

    public Flights(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public void addFlight(String departureAirport, String arrivalAirport) {
        flights.add(new Flights(departureAirport,arrivalAirport));
    }

    public Set<Flights> getFlightsList(){
        return flights;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
