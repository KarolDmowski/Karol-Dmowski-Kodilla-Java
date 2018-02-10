package com.kodilla.good.patterns.FlightSchedule;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinderService {

    public List<Flight> findFlightFromStart(Airport departureAirport){
        return FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getStart().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToEnd (Airport arrivalAirport) {
        return FlightDataBase.getFlightsCollection().stream()
                .filter(flights -> flights.getEnd().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public void findFlightWithTransfer(Airport departureAirport, Airport arrivalAirport){
        List<Flight> setOfDepartureFlights = findFlightFromStart(departureAirport);
        List<Flight> setOfArrivalFlights = findFlightsToEnd(arrivalAirport);

        for(Flight flightFrom : setOfDepartureFlights){
            for(Flight flightTo : setOfArrivalFlights){
                if(flightFrom.getEnd().equals(flightTo.getStart())){
                    System.out.println("Flight departure: " + departureAirport + ", transfer in: "
                    + flightFrom.getEnd() + ", arrival in: " + arrivalAirport);
                }
            }
        }
    }
}
