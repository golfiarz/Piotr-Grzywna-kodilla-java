package com.kodilla.goodPatterns.Aviation;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args){

        Airport airport1 = new Airport("Jasionka");
        Airport airport2 = new Airport("Balice");
        Airport airport3 = new Airport("Modlin");
        Airport airport4 = new Airport("Gdansk");
        Airport airport5 = new Airport("Wroclaw");

        Flight flight1 = new Flight(airport1, airport2);
        Flight flight2 = new Flight(airport2, airport3);
        Flight flight3 = new Flight(airport3, airport1);
        Flight flight4 = new Flight(airport5, airport2);
        Flight flight5 = new Flight(airport2, airport4);
        Flight flight6 = new Flight(airport2, airport5);



        Timetable timetable = new Timetable();
        timetable.addFlight(flight1);
        timetable.addFlight(flight2);
        timetable.addFlight(flight3);
        timetable.addFlight(flight4);
        timetable.addFlight(flight5);
        timetable.addFlight(flight6);

        FlightSerch flightSerch = new FlightSerch(timetable);

        System.out.println(flightSerch.flightByDepartureSerched(airport1));

        System.out.println(flightSerch.flightByArrivalSerched(airport2));

        System.out.println(flightSerch.findFlightByDepartureAndArrivalAirposts(airport1 , airport2, airport3));


    }















}
