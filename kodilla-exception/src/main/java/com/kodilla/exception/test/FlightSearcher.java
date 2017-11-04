package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

     private Map<String, Boolean> airportMap = new HashMap<>();

    public Map<String, Boolean> addInfomationAboutAirport(Flight noFlight , boolean airportStatus){
        String arrivalAirport = noFlight.getArrivalAirport() ;
        airportMap.put(arrivalAirport, airportStatus);
        return airportMap ;
    }

    public Boolean findFilght(Flight noFlight) {
        String arrivalAirport = noFlight.getArrivalAirport() ;
         return airportMap.get(arrivalAirport);

    }
}
