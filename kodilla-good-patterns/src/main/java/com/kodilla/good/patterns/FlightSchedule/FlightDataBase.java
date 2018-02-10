package com.kodilla.good.patterns.FlightSchedule;

import java.util.HashSet;
import java.util.Set;

public class FlightDataBase implements FlightRepository {
    private static Set<Flight> flightsCollection = new HashSet<>();

    public static Set<Flight> getFlightsCollection() {
        return flightsCollection;
    }

    @Override
    public boolean addFlightToCollection(Flight flight) {
        if(flightsCollection.contains(flight)){
            return false;
        } else {
            flightsCollection.add(flight);
            return true;
        }
    }
}
