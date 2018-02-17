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
        return getPopulation();
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public BigDecimal getPopulation() {
        return population;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return nameCountry.equals(country.nameCountry);
    }


}
