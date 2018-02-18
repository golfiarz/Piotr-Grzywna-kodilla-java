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
        List<Country> countriesEurope = new ArrayList<>();
        List<Continent> worldContinents = new ArrayList<>();


        //When
        countriesEurope.add(new Country("Poland","40000000"));
        countriesEurope.add(new Country("German", "50000000"));
        countriesEurope.add(new Country("France", "60000000"));

        //Then
        BigDecimal populationEqual = new BigDecimal("150000000");
        Assert.assertEquals(populationEqual, worldContinents.getPeopleQuantiry(),0 );
    }

}
