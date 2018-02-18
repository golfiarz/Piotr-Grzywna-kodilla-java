package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World populationWorld = new World();
        Continent europa = new Continent();
        Continent northAmerica = new Continent();



        //When
        europa.addCountries(new Country("Poland",BigDecimal.valueOf(40_000_000)));
        europa.addCountries(new Country("German", BigDecimal.valueOf(50_000_000)));
        europa.addCountries(new Country("France", BigDecimal.valueOf(60_000_000)));
        northAmerica.addCountries(new Country("USA", BigDecimal.valueOf(250_000_000)));
        northAmerica.addCountries(new Country("Canada",BigDecimal.valueOf(20_000_000)));
        populationWorld.addContinents(europa);
        populationWorld.addContinents(northAmerica);



        //Then
        BigDecimal populationEqual = new BigDecimal("420000000");
        Assert.assertEquals(populationEqual, populationWorld.getPeopleQuantity());
    }

}
