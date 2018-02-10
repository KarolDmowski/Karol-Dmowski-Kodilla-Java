package com.kodilla.good.patterns.FlightSchedule;

import java.util.HashMap;
import java.util.Map;

public class FlightDataBase implements FlightRepository {
    private static Map<Airport, Flight> flightsCollectionDepartureKey = new HashMap<>();
    private static Map<Airport, Flight> flightsCollectionArrivalKey = new HashMap<>();

    public static Map<Airport, Flight> getFlightsCollectionDepartureKey() {
        return flightsCollectionDepartureKey;
    }

    public static Map<Airport, Flight> getFlightsCollectionArrivalKey() {
        return flightsCollectionArrivalKey;
    }

    @Override
    public boolean addFlightToCollection(Flight flight) {
        if(flightsCollectionDepartureKey.containsValue(flight)){
            return false;
        } else {
            flightsCollectionDepartureKey.put(flight.getStart(), flight);
            flightsCollectionArrivalKey.put(flight.getEnd(), flight);
            return true;
        }
    }
}
