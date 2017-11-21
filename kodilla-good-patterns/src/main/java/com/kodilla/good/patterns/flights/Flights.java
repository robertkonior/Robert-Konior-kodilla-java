package com.kodilla.good.patterns.flights;

import java.util.HashSet;

public class Flights {

    private HashSet<Flight> flights = new HashSet<>();

    public Flights(HashSet<Flight> flights) {
        this.flights = flights;
    }

    public  HashSet<Flight> getFlightsList(){
        return  flights;
    }

}
