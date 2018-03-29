package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1f,1);
        } catch (MyException e) {
            System.out.println("Problem " + e.getMessage());

        } finally {

            System.out.println("Checked numbers");

        }

    }
}
