package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flights {

    public void addFlight(Airport airport,Airport airport2) {
        airport.addDepartures(airport2);
        airport2.addArrivals(airport);
    }

    public static Map<Airport,List<Airport>> getArrivals(Airport airport) {
        Map<Airport, List<Airport>> arrivalsMap = new HashMap<>();
        arrivalsMap.put(airport, airport.getArrivals());
        return arrivalsMap;
    }

    public static Map<Airport,List<Airport>> getDepartures(Airport airport) {
        Map<Airport,List<Airport>> departuresMap = new HashMap<>();
        departuresMap.put(airport,airport.getDepartures());
        return departuresMap;
    }

    public static Map<List<Airport>, List<Airport>> getAllFlights(Airport airport){
        Map<List<Airport>, List<Airport>> allFlightsMap = new HashMap<>();
        allFlightsMap.put(airport.getArrivals(),airport.getDepartures());
        return allFlightsMap;
    }

}
