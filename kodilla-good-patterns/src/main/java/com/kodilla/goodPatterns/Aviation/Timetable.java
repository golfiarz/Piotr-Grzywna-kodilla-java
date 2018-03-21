package com.kodilla.goodPatterns.Aviation;

import java.util.ArrayList;
import java.util.List;

public final class Timetable {
    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public boolean removeFlight(Flight flight) {
        return flights.remove(flight);
    }


}
