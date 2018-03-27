package com.kodilla.rps;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Double a;
        Double b;
        Scanner data = new Scanner(System.in);
        a = data.nextDouble();
        b = data.nextDouble();
        System.out.println("a:"+ a + "b:" + b);
        double sum = a + b;
        System.out.println(sum);


    }
}
