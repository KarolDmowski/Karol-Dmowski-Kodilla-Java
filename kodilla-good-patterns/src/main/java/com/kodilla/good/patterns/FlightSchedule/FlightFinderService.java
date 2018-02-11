package com.kodilla.good.patterns.FlightSchedule;

import java.util.ArrayList;
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

    public List<FlightsWithTransfer> findFlightWithTransfer(Airport departureAirport, Airport arrivalAirport){
        List<Flight> setOfDepartureFlights = findFlightFromStart(departureAirport);
        List<Flight> setOfArrivalFlights = findFlightsToEnd(arrivalAirport);
        List<FlightsWithTransfer> listOfFlightsWithTransfer = new ArrayList<>();

        for(Flight flightFrom : setOfDepartureFlights){
            for(Flight flightTo : setOfArrivalFlights){
                if(flightFrom.getEnd().equals(flightTo.getStart())){
                    listOfFlightsWithTransfer.add(new FlightsWithTransfer(departureAirport,
                            flightFrom.getEnd(), arrivalAirport));
                }
            }
        }
        return listOfFlightsWithTransfer;
    }
}
