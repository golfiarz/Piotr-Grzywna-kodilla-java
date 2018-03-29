package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        double sum = 0;
        Random generator = new Random();
        int[] numbersTab = new int[20];
        for(int i=0; i<20; i++){
            numbersTab[i]=generator.nextInt(6);
            sum = sum + numbersTab[i];
        }
        double average = sum / numbersTab.length;
        //When
        double averageNumber =  ArrayOperations.getAverage(numbersTab);
        //Then
        Assert.assertEquals(average , averageNumber, 0);

    }
}
