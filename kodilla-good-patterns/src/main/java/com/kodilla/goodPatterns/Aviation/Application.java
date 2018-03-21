package com.kodilla.goodPatterns.Aviation;


import java.util.ArrayList;
import java.util.List;

public class Application {

    Airport airport1 = new Airport("Jasionka");
    Airport airport2 = new Airport("Balice");
    Airport airport3 = new Airport("Modlin");

    Flight flight1 = new Flight(airport1, airport2);
    Flight flight2 = new Flight(airport1, airport3);
    Flight flight3 = new Flight(airport2, airport3);

    Timetable timetable = new Timetable();
    timetable.addFlight(Flight);











}
