package com.kodilla.good.patterns.flights;

public class FlightSearcher {

    public void searchArrivalsFromAirport(Airport airport){
        System.out.println("To airport" + airport + "arriving  from : ");
        Flights.getArrivals(airport)
                .values().stream()
                .forEach(System.out::println);
    }

    public void searchDeparturesFromAirport(Airport airport){
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
