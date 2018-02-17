package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addConinent(Continent continent){
        continents.add(continent);
    }

    public boolean removeContinent(Continent continent){
        return continents.remove(continent);
    }






}
