package com.kodilla.exception.test;

public class SearchingFlightProcessRunner {

    FlightSearcher flightSearcher = new FlightSearcher();

    private void confirmLanding(Flight noFlight){

        if (flightSearcher.findFilght(noFlight) ){
            System.out.println("You can landing");
        } else if  (!(flightSearcher.findFilght(noFlight))){
            System.out.println("You can't landing");
        }


    }




    public static void main(String[] args) {

        Flight LAXtoWWA = new Flight("Los Angeles", "Warszawa");
        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.addInfomationAboutAirport(LAXtoWWA,true);
        SearchingFlightProcessRunner searchingFlightProcessRunner = new SearchingFlightProcessRunner();
        searchingFlightProcessRunner.confirmLanding(LAXtoWWA);



    }

}
