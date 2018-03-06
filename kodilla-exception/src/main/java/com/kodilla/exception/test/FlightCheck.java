package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public final class FlightCheck {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Jasionka", true);
        airports.put("Stansed", true);




            if (airports.get(flight.getArrivalAirport())) {

                System.out.println("Available");
            } else {

                System.out.println("Not");
            }

        airports.containsKey(flight);

        throw new RouteNotFoundException();

        }
    }



