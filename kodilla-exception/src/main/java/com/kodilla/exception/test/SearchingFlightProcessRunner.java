package com.kodilla.exception.test;

public class SearchingFlightProcessRunner {

    public static void confirmLanding(boolean flightResult){

        if (flightResult ){
            System.out.println("You can landing");
        } else {
            System.out.println("You can't landing");
        }

    }

    public static void main(String[] args) throws RouteNotFoundException {

        Flight LAXtoWWA = new Flight("Los Angeles", "Warszawa");
        Flight NYKtoLGW = new Flight("New York", "London Gatwick");
        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.addInfomationAboutAirport(LAXtoWWA,true);

        try {
            boolean flightResult = flightSearcher.findFlight(NYKtoLGW);
            confirmLanding(flightResult);

        }catch (RouteNotFoundException e){
            System.out.println("this airport does exist");
        }

    }

}
