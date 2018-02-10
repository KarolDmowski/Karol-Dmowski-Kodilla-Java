package com.kodilla.good.patterns.FlightSchedule;

public class FlightCreationService implements FlightService {
    private FlightDataBase flightDataBaseFromDeparture = new FlightDataBase();

    public FlightCreationService(FlightDataBase flightDataBase) {
        this.flightDataBaseFromDeparture = flightDataBase;
    }

    @Override
    public boolean createFlight(Airport startAirport, Airport endAirport) {
        Flight flight = new Flight(startAirport, endAirport);
        if(flightDataBaseFromDeparture.getFlightsCollectionDepartureKey().containsValue(flight)){
            return false;
        } else {
            flightDataBaseFromDeparture.addFlightToCollection(flight);
            return true;
        }
    }


}
