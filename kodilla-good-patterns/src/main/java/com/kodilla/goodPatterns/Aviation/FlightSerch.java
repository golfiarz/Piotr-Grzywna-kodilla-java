package com.kodilla.goodPatterns.Aviation;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSerch {

    private Timetable timetable;

    public FlightSerch(Timetable timetable) {
        this.timetable = timetable;
    }

    public List<Airport> flightByDepartureSerched(Airport airport) {
        System.out.println("All flights from: " + airport + " are to :");
        return timetable.getFlights().stream()
                .filter(a -> a.getDepart().equals(airport))
                .map(air -> air.getArrival())
                .collect(Collectors.toList());
    }

    public List<Airport> flightByArrivalSerched(Airport airport) {
        System.out.println("All flight to: " + airport + " are from: " );
        return timetable.getFlights().stream()
                .filter(a -> a.getArrival().equals(airport))
                .map(a -> a.getDepart())
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightByDepartureAndArrivalAirposts(Airport arrival, Airport depart, Airport via){
        System.out.println("Flight to : " + arrival + " from " + depart + " via " + via);
        return timetable.getFlights().stream()
                .filter(a -> a.getArrival().equals(arrival) && a.getDepart().equals(via)
                        || a.getDepart().equals(depart) && a.getArrival().equals(via))
                .collect(Collectors.toList());

    }


}






