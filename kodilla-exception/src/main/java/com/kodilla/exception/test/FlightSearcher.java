package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

      Map<String, Boolean> airportMap = new HashMap<>();

    public Map<String, Boolean> addInfomationAboutAirport(Flight noFlight , boolean airportStatus){
        String arrivalAirport = noFlight.getArrivalAirport() ;
        airportMap.put(arrivalAirport, airportStatus);
        return this.airportMap ;
    }

    public Boolean findFlight(Flight noFlight) throws RouteNotFoundException {
        String arrivalAirport = noFlight.getArrivalAirport() ;
        if(airportMap.get(arrivalAirport)!= null ){
            return airportMap.get(arrivalAirport);
        }
        throw  new RouteNotFoundException();



    }
}
