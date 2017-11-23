package com.kodilla.good.patterns.flights;

import org.junit.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
        flightsList.add(new Flight("rome", "paris"));
        flightsList.add(new Flight("paris", "newYork"));


        return flightsList;
    }

    @Test
    public void testSearchDeparturesFromAirport() {

        //Given
        HashSet<Flight> flightsList = getFlightList();
        HashSet<Flight> expectedFlights = new HashSet<>();
        expectedFlights.add(new Flight("miami", "oslo"));
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<Flight> testedFlightsSet = flightSearcher.searchDeparturesFromAirport("miami");
        //Then
        Assert.assertEquals(expectedFlights, testedFlightsSet);
    }

    @Test
    public void testSearchArrivalsToAirport(){
        //Given
        HashSet<Flight> flightsList = getFlightList();
        HashSet<Flight> expectedFlights = new HashSet<>();
        expectedFlights.add(new Flight("krakow", "warsaw"));
        expectedFlights.add(new Flight("rome", "warsaw"));
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<Flight> testedFlightsSet = flightSearcher.searchArrivalsToAirport("warsaw");
        //Then
        Assert.assertEquals(expectedFlights, testedFlightsSet);
    }

    @Test
    public void testSearchFlightFromAirportToAirport(){
        //Given
        HashSet<Flight> flightsList = getFlightList();
        List<Flight> firstConnectedFlight = new LinkedList<>();
        firstConnectedFlight.add(new Flight("rome","paris"));
        firstConnectedFlight.add(new Flight("paris","newYork"));
        List<Flight> secondConnectedFlight = new LinkedList<>();
        secondConnectedFlight.add(new Flight("rome","warsaw"));
        secondConnectedFlight.add(new Flight("warsaw","newYork"));
        Set<List<Flight>> expectedFlights = new HashSet<>();
        expectedFlights.add(firstConnectedFlight);
        expectedFlights.add(secondConnectedFlight);
        //When
        Flights flights = new Flights(flightsList);
        FlightSearcher flightSearcher = new FlightSearcher(flights);
        Set<List<Flight>> testedFlightsSet = flightSearcher.searchFlightFromAirportToAirport("rome","newYork");
        //Then
        Assert.assertEquals(expectedFlights, testedFlightsSet);
    }

}
