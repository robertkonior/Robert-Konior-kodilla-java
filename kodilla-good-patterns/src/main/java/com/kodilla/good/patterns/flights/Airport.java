package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String name ;

    private List<Airport> arrivals = new ArrayList<>();
    private List<Airport> departures = new ArrayList<>();


    public Airport(String name) {
        this.name = name;
    }

    public void  addArrivals(Airport airport){
        arrivals.add(airport);
    }

    public void addDepartures(Airport airport){
        departures.add(airport);
    }

    public String getName() {
        return name;
    }

    public List<Airport> getArrivals() {
        return arrivals;
    }

    public List<Airport> getDepartures() {
        return departures;
    }


}
