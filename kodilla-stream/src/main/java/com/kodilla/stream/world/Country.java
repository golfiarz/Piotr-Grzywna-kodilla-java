package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String nameCountry;
    private final BigDecimal population;

    public Country(String nameCountry, BigDecimal population) {
        this.nameCountry = nameCountry;
        this.population = population;
    }

    public BigDecimal getPeopleQuantity(){
        return population;
    }

    public String getNameCountry() {
        return nameCountry;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameCountry.equals(country.nameCountry);
    }

    @Override
    public int hashCode() {
        return nameCountry.hashCode();
    }
}
