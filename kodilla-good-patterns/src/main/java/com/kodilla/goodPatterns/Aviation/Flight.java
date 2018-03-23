package com.kodilla.goodPatterns.Aviation;

public final class Flight {
    private Airport depart;
    private Airport arrival;

    public Flight(Airport depart, Airport arrival) {
        this.depart = depart;
        this.arrival = arrival;
    }

    public Airport getDepart() {
        return depart;
    }

    public Airport getArrival() {
        return arrival;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "depart=" + depart +
                ", arrival=" + arrival +
                '}';
    }
}




