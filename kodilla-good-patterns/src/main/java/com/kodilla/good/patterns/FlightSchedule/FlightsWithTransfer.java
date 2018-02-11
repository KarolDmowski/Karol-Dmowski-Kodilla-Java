package com.kodilla.good.patterns.FlightSchedule;

public class FlightsWithTransfer {
    private Airport departureAirport;
    private Airport transferAirport;
    private Airport arrivalAirport;

    public FlightsWithTransfer(Airport departureAirport, Airport transferAirport, Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getTransferAirport() {
        return transferAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public String toString() {
        return "Flight departure: " + departureAirport + ", transfer in: "
                + transferAirport + ", arrival in: " + arrivalAirport;
    }
}
