package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
   }
   @Test
    public void testOddNumbersExterminatorEmptyList() {
       //Given

       ArrayList<Integer> number = new ArrayList<Integer>() ;
       OddNumbersExterminator exterm = new OddNumbersExterminator();
       exterm.exterminate(number);
       //When
       int size = number.size();
       System.out.println("Testing Empty List: " + size);
       //Then
       Assert.assertEquals(0, size);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
       //Given
        Random randomGenerator = new Random();
        ArrayList<Integer> number = new ArrayList<Integer>();
        for (int i=0; i<20; i++) {
            int ran = randomGenerator.nextInt(50);
            number.add(ran);
        }
        //When
        System.out.println("Testing Normal List");
        OddNumbersExterminator exterm = new OddNumbersExterminator();
        ArrayList<Integer> result = exterm.exterminate(number);
        //Then
        for (int k=0; k<result.size(); k++) {
            int numberEven = result.get(k);
            Assert.assertEquals(true, numberEven % 2 == 0);

        }




    }
}
