package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){
       /* double x = 1.0;
        int number = IntStream.range(0,20)
                .forEach(System.out::print);
        int number = IntStream.range(0,20)
                .average();
        double averageNumber = number / x;
        return averageNumber;
        */

        IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::print);
        double averageNum = IntStream.range(0,numbers.length)
                .map(n -> numbers[n])
                .average()
                .orElse(0);
        return averageNum;

    }
}
