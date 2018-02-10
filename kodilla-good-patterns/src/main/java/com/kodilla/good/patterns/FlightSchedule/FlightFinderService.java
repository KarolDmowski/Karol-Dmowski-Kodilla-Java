package com.kodilla.good.patterns.FlightSchedule;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinderService {

    public void findFlightsfromStart(Airport departureAirport){
         FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getStart().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightsToEnd (Airport arrivalAirport) {
        FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getEnd().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void finfFlightWithTransfer (Airport departureAirport, Airport arrivalAirport){
        Set<Flight> setOfDepurtereFlights = FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getStart().equals(departureAirport))
                .collect(Collectors.toSet());

        Set<Flight> setOfArrivalFlights = FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getEnd().equals(arrivalAirport))
                .collect(Collectors.toSet());

        for(Flight flightFrom : setOfDepurtereFlights){
            for(Flight flightTo : setOfArrivalFlights){
                if(flightFrom.getEnd().equals(flightTo.getStart())){
                    System.out.println("Flight departure: " + departureAirport + ", transfer in: "
                    + flightFrom.getEnd() + ", arrival in: " + arrivalAirport);
                }
            }
        }
    }
}
