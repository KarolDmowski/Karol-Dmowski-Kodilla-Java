package com.kodilla.good.patterns.FlightSchedule;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        FlightCreationService flightCreator = new FlightCreationService();
        flightCreator.createFlight(new Airport("a"),new Airport("b"));
        flightCreator.createFlight(new Airport("a"),new Airport("c"));
        flightCreator.createFlight(new Airport("a"),new Airport("d"));
        flightCreator.createFlight(new Airport("b"),new Airport("a"));
        flightCreator.createFlight(new Airport("b"),new Airport("c"));
        flightCreator.createFlight(new Airport("b"),new Airport("d"));
        flightCreator.createFlight(new Airport("c"),new Airport("a"));
        flightCreator.createFlight(new Airport("c"),new Airport("b"));
        flightCreator.createFlight(new Airport("c"),new Airport("d"));
        flightCreator.createFlight(new Airport("d"),new Airport("a"));
        flightCreator.createFlight(new Airport("d"),new Airport("b"));
        flightCreator.createFlight(new Airport("d"),new Airport("c"));

        FlightFinderService finder = new FlightFinderService();
        List<Flight> flightList = finder.findFlightFromStart(new Airport("b"));
        flightList.stream().forEach(System.out::println);

        flightList = finder.findFlightsToEnd(new Airport("d"));
        flightList.stream().forEach(System.out::println);

        finder.findFlightWithTransfer(new Airport("b"), new Airport("c"));
    }
}
