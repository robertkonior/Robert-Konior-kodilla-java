package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

      private Map<String, Boolean> airportMap = new HashMap<>();

    public Map<String, Boolean> addInfomationAboutAirport(Flight noFlight , boolean airportStatus){
        String arrivalAirport = noFlight.getArrivalAirport() ;
        airportMap.put(arrivalAirport, airportStatus);
        return this.airportMap ;
    }

    public Boolean findFlight(Flight noFlight) throws RouteNotFoundException {
        String arrivalAirport = noFlight.getArrivalAirport() ;
        Boolean status = airportMap.get(arrivalAirport);
        if(status != null ){
            return status;
        }
        throw  new RouteNotFoundException();
    }
}
