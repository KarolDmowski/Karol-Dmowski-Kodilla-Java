package com.kodilla.good.patterns.FlightSchedule;

public class FlightFinderService {

    public void findFlightsfromStart(Airport departureAirport){
         FlightDataBase.getFlightsCollectionDepartureKey().entrySet().stream()
                .filter(flights -> flights.getKey().equals(departureAirport))
                .map(flight -> flight.getValue())
                .forEach(System.out::println);
    }

    public void findFlightsToEnd (Airport arrivalAirport) {
        FlightDataBase.getFlightsCollectionArrivalKey().entrySet().stream()
                .filter(flights -> flights.getKey().equals(arrivalAirport))
                .map(flight -> flight.getValue())
                .forEach(System.out::println);
    }
}
