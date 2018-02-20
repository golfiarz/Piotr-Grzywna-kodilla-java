package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public BigDecimal getPeopleQuantity(){
         BigDecimal totalPopulation = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
         return totalPopulation;

    }

    public void addContinents(Continent continent){
        continents.add(continent);
    }

    public boolean removeContinents(Continent continent){
        return continents.remove(continents);
    }

}
