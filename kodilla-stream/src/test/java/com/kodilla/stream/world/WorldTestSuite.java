package com.kodilla.stream.world;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countriesEurope = new ArrayList<>();
        countriesEurope.add(new Country("Poland","40000000"));
        countriesEurope.add(new Country("German", "50000000"));
        countriesEurope.add(new Country("France", "60000000"));


    }

}
