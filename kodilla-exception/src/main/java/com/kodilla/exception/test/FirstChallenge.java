package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
           try{
               throw new ArithmeticException();
           } catch (ArithmeticException e) {
               System.out.println("Oh no! Something went wrong" + e);
           } finally {
               System.out.println("I am gonna be here ... always!");
           }
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
