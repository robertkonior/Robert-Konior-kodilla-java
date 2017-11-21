package com.kodilla.good.patterns.flights;

import org.junit.*;

import java.util.HashSet;
import java.util.Set;

public class FlightTestSuite {


    public HashSet<Flight> getFlightList() {

        HashSet<Flight> flightsList = new HashSet<>();
        flightsList.add(new Flight("warsaw", "berlin"));
        flightsList.add(new Flight("miami", "oslo"));
        flightsList.add(new Flight("krakow", "warsaw"));
        flightsList.add(new Flight("newYork", "krakow"));
        flightsList.add(new Flight("rome", "warsaw"));
        flightsList.add(new Flight("warsaw", "newYork"));


        return flightsList;
    }

    @Test
    public void testSearchDeparturesFromAirport() {

        //Given
        HashSet<Flight> flightsList = getFlightList();
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<Flight> testedFlightsSet = flightSearcher.searchDeparturesFromAirport("miami");
        //Then
        Assert.assertEquals(2, testedFlightsSet.size());
    }

    @Test
    public void testSearchArrivalsToAirport(){
        //Given
        HashSet<Flight> flightsList = getFlightList();
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<Flight> testedFlightsSet = flightSearcher.searchArrivalsToAirport("warsaw");
        //Then
        Assert.assertEquals(2, testedFlightsSet.size());
    }

    @Test
    public void testSearchFlightFromAirportToAirport(){
        //Given
        HashSet<Flight> flightsList = getFlightList();
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<Flight> testedFlightsSet = flightSearcher.searchFlightFromAirportToAirport("rome","newYork");
        //Then
        Assert.assertEquals(1, testedFlightsSet.size());
    }

}
