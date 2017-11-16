package com.kodilla.good.patterns.flights;

import org.junit.Test;

public class FlightTestSuite {


    @Test
    public void testFlightSearcher(){


        Airport warsaw = new Airport("WAW");
        Airport berlin = new Airport("TLX");
        Airport rome = new Airport("ROM");
        Airport oslo = new Airport("OSL");
        Airport miami = new Airport("MAM");
        Airport newYork = new Airport("NYK");
        Airport krakow = new Airport("KRK");

        Flights flights = new Flights();

        flights.addFlight(warsaw,berlin);
        flights.addFlight(miami,oslo);
        flights.addFlight(krakow,warsaw);
        flights.addFlight(newYork,krakow);
        flights.addFlight(rome,warsaw);
        flights.addFlight(miami,newYork);

        FlightSearcher flightSearcher = new FlightSearcher();

        flightSearcher.searchDeparturesFromAirport(miami);

        flightSearcher.searchArrivalsFromAirport(warsaw);

        flightSearcher.searchFlightFromToByTrough(krakow,berlin,warsaw);
    }

}
