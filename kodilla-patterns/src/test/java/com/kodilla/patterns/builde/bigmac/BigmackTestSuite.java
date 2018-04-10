package com.kodilla.patterns.builde.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmackTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers(2)
                .souce("standard")
                .ingredient("salat")
                .ingredient("onion")
                .ingredient("peppers")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
    }
}
