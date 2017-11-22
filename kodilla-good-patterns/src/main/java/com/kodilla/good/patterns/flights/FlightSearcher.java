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

    public Set<List<Flight>> searchFlightFromAirportToAirport(String departureAirports, String arrivalAirports) {
        Set<Flight> firstFlight = searchDeparturesFromAirport(departureAirports);
        Set<Flight> secondFlight = searchArrivalsToAirport(arrivalAirports);

        return firstFlight.stream().collect(
                HashSet<List<Flight>>::new,
                (flightConnections, departureFlight) -> flightConnections.add(getConnection(departureFlight, secondFlight)),
                AbstractCollection::addAll
        );
    }

    private List<Flight> getConnection(Flight departureFlight, Set<Flight> secondFlight) {
        return secondFlight.stream()
                .filter(arrivalFlight -> departureFlight.getArrivalAirport().equals(arrivalFlight.getDepartureAirport()))
                .collect(
                        LinkedList::new,
                        (flightConnection, arrivalFlight) -> {
                            flightConnection.add(departureFlight);
                            flightConnection.add(arrivalFlight);
                        },
                        AbstractCollection::addAll
                );
    }
}
