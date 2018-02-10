package com.kodilla.good.patterns.FlightSchedule;

public final class Flight {
    private final Airport start;
    private final Airport end;

    public Flight(final Airport start, final Airport end) {
        this.start = start;
        this.end = end;
    }

    public Airport getStart() {
        return start;
    }

    public Airport getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
