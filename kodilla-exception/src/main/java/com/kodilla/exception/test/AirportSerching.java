package com.kodilla.exception.test;
import com.kodilla.exception.test.FlightCheck;
public class AirportSerching {
    public static void main(String[] args) {

        Flight flight = new Flight("Jasionka", "A");
        FlightCheck flightCheck = new FlightCheck();

        try {

            flightCheck.findFlight(flight);

        } catch (RouteNotFoundException e) {


            System.out.println("Problem" + e.getMessage());

        } finally {

            System.out.println("Airport serch");
        }
    }
}



