package com.kodilla.good.patterns.flights;

import java.util.*;

public class FlightSearcher {

    HashSet<Flights> flights ;

    public FlightSearcher(HashSet<Flights> flights) {
        this.flights = flights;
    }

    private static Map<String,HashSet<String> getArrivals(String airport,HashSet<Flights> flights) {
        if(flights.contains(getArrivals())=airport)
        Map<String, HashSet<String>> arrivalsMap = new HashMap<>();
        arrivalsMap.put(airport, airport.getArrivals());
        return arrivalsMap;
    }

    private static Map<Airport,List<Airport>> getDepartures(String airport) {
        Map<Airport,List<Airport>> departuresMap = new HashMap<>();
        departuresMap.put(airport,airport.getDepartures());
        return departuresMap;
    }

    private static Map<List<Airport>, List<Airport>> getAllFlights(Airport airport){
        Map<List<Airport>, List<Airport>> allFlightsMap = new HashMap<>();
        allFlightsMap.put(airport.getArrivals(),airport.getDepartures());
        return allFlightsMap;
    }



    public void searchArrivalsFromAirport(String airport){
        System.out.println("To airport" + airport + "arriving  from : ");
        Flights.getArrivals(airport)
                .values().stream()
                .forEach(System.out::println);
    }

    public void searchDeparturesFromAirport(String airport){
        System.out.println("To airport" + airport + "departures  from : ");
        Flights.getDepartures(airport)
                .values().stream()
                .forEach(System.out::println);
    }

    public void searchFlightFromToByTrough(Airport depAirport , Airport arrAirport , Airport byAirport){
        System.out.println("I found this flight from " +depAirport);
        System.out.println("By through ");
        Flights.getAllFlights(depAirport)
                .entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .filter(n-> n.equals(byAirport))
                .forEach(System.out::println);
        System.out.println("To");
        Flights.getAllFlights(byAirport)
                .entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .filter(n-> n.equals(arrAirport))
                .forEach(System.out::println);

    }
}
