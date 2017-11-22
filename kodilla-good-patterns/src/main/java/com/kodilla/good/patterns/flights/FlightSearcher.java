package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearcher {

    private Flights flights;

    public FlightSearcher(Flights flights) {
        this.flights = flights;
    }

    public Set<Flight> searchDeparturesFromAirport(String airport){

        Set<Flight> departureAirports = flights.getFlightsList().stream()
                .filter(departure -> departure.getDepartureAirport().equals(airport))
                .collect(Collectors.toSet());

        if (departureAirports == null) {
            System.out.println("No results found!");
        } else {
            System.out.println("Flights from: " +airport);
            departureAirports.forEach(System.out::println);
        }
        return departureAirports;
    }

    public Set<Flight> searchArrivalsToAirport(String airport){

       Set<Flight> arrivalAirports = flights.getFlightsList().stream()
               .filter(arrival -> arrival.getArrivalAirport().equals(airport))
               .collect(Collectors.toSet());

        if (arrivalAirports == null) {
            System.out.println("No results found!");
        } else {
            System.out.println("Flights to: " +airport);
            arrivalAirports.forEach(System.out::println);
        }
        return arrivalAirports;
    }

    public Set<Flight> searchFlightFromAirportToAirport(String departureAirports ,String arrivalAirports){

//        Map<Flight,Flight> flightMap = new HashMap<>();
//
//        Set<String> connectedAirportsFrom =searchDeparturesFromAirport(departureAirports).stream()
//                .map(f -> f.getArrivalAirport())
//                .collect(Collectors.toSet());
//
//        Set<Flight> flightsVia = searchArrivalsToAirport(arrivalAirports).stream()
//                .filter(f -> connectedAirportsFrom.contains(f.getDepartureAirport()))
//                .collect(Collectors.toSet());
//
//        return flightsVia;

        Set<Flight> firstFlight = searchDeparturesFromAirport(departureAirports);
        Set<Flight> secondflight = searchArrivalsToAirport(arrivalAirports);

        Set<List<Flight>> flightMap = firstFlight.stream().filter(f-> f.getArrivalAirport().equals(secondflight.contains(f.getDepartureAirport())))
                .collect(Collectors.toCollection(Set<List<Flight>>));

    }
}
