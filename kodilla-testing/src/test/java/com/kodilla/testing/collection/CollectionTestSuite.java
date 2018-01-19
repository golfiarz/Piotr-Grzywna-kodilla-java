package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
   @Test
    public void testOddNumbersExterminatorEmptyList() {
       //Given
       Random randomGenerator = new Random();
       ArrayList<Integer> number = new ArrayList<Integer>() ;
       OddNumbersExterminator exterm = new OddNumbersExterminator();
       exterm.exterminate(number);
       //When
       int size = number.size();
       System.out.println("Testing " + size);
       //Then
       Assert.assertEquals(0, size);

    }
}
