package com.kodilla.goodPatterns.Aviation;

public final class Airport {
    private final String airport;

    public Airport(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public String toString() {
        return "airport='" + airport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport1 = (Airport) o;

        return airport != null ? airport.equals(airport1.airport) : airport1.airport == null;
    }

    @Override
    public int hashCode() {
        return airport != null ? airport.hashCode() : 0;
    }
}
