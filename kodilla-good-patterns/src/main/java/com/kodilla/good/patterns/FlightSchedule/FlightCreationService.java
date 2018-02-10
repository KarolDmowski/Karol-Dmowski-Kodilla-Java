package com.kodilla.good.patterns.FlightSchedule;

public class FlightCreationService implements FlightService {
    private static FlightDataBase flightDataBaseFromDeparture = new FlightDataBase();

    @Override
    public boolean createFlight(Airport startAirport, Airport endAirport) {
        Flight flight = new Flight(startAirport, endAirport);
        if(flightDataBaseFromDeparture.getFlightsCollection().contains(flight)){
            return false;
        } else {
            flightDataBaseFromDeparture.addFlightToCollection(flight);
            return true;
        }
    }


}
