package com.kodilla.good.patterns.FlightSchedule;

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
        finder.findFlightsfromStart(new Airport("b"));
        finder.findFlightsToEnd(new Airport("d"));
        finder.finfFlightWithTransfer(new Airport("a"), new Airport("c"));
    }
}
