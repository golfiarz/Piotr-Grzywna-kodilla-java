package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> countries = new ArrayList<>();

    public List<Country> getCountries() {
        return countries;
    }

    public void addCountries(Country country){
        countries.add(country);
    }

    public boolean removeCountries(Country country){
        return countries.remove(country);
    }
}

