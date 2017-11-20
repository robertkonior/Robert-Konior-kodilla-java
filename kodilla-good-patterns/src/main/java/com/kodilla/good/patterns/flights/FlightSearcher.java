package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearcher {

    HashSet<Flights> flights ;
    Flights flights;

    public FlightSearcher(HashSet<Flights> flights) {
        this.flights = flights;
    }

//    private static Map<String,HashSet<String> getArrivals(String airport,HashSet<Flights> flights) {
//        if(flights.contains(g)=airport)
//
//        Map<String, HashSet<String>> arrivalsMap = new HashMap<>();
//        arrivalsMap.put(airport, airport.getArrivals());
//        return arrivalsMap;
//    }
//
//    private static Map<Airport,List<Airport>> getDepartures(String airport) {
//        Map<Airport,List<Airport>> departuresMap = new HashMap<>();
//        departuresMap.put(airport,airport.getDepartures());
//        return departuresMap;
//    }
//
//    private static Map<List<Airport>, List<Airport>> getAllFlights(Airport airport){
//        Map<List<Airport>, List<Airport>> allFlightsMap = new HashMap<>();
//        allFlightsMap.put(airport.getArrivals(),airport.getDepartures());
//        return allFlightsMap;
//    }



    public Set<Flights> searchDeparturesFromAirport(String airport){

        Set<Flights> departureAirports =flights.getFlightsList().stream()
                .filter(departure -> departure.getDepartureAirport().equals(airport))
                .collect(Collectors.toSet());

        if (departureAirports.equals(null)) {
            System.out.println("No results found!");
            return null;
        } else {
            System.out.println("Flights from: " +airport);
            departureAirports.forEach(System.out::println);
            return departureAirports;
        }

    }

    public Set<Flights> searchArrivalsFromAirport(String airport){

       Set<Flights> arrivalAirports = flights.getFlightsList().stream()
               .filter(arrival -> arrival.getArrivalAirport().equals(airport))
               .collect(Collectors.toSet());

        if (arrivalAirports.equals(null)) {
            System.out.println("No results found!");
            return null;
        } else {
            System.out.println("Flights to " +airport);
            arrivalAirports.forEach(System.out::println);
            return arrivalAirports;
        }


    }

    public void searchFlightFromAirportToAirport(String departureAirports ,String arrivalAirports){

        List<String> connectedAirportsFrom =searchDeparturesFromAirport(departureAirports).stream()
                .filter(f -> !f.equals(d))




//        Map<Set<Flights>,Set<Flights>> flightBaseToAirports = new HashMap<>();
//        flightBaseToAirports.put(searchDeparturesFromAirport(departureAirports),searchArrivalsFromAirport(arrivalAirports));
//
//        flightBaseToAirports.entrySet().stream()
//                .flatMap(n -> n.getKey().stream())
//                .filter((arrival -> arrival.getArrivalAirport().compareTo(searchArrivalsFromAirport(arrivalAirports)));
//                .equals(flightBaseToAirports.entrySet().stream().flatMap(n->n.getValue().stream().filter(departure ->departure.getDepartureAirport())));


//
//        System.out.println("I found this flight from " +depAirport);
//        System.out.println("By through ");
//        Flights.getAllFlights(depAirport)
//                .entrySet().stream()
//                .flatMap(n -> n.getValue().stream())
//                .filter(n-> n.equals(byAirport))
//                .forEach(System.out::println);
//        System.out.println("To");
//        Flights.getAllFlights(byAirport)
//                .entrySet().stream()
//                .flatMap(n -> n.getValue().stream())
//                .filter(n-> n.equals(arrAirport))
//                .forEach(System.out::println);

    }
}
