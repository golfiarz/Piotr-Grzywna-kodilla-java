package com.kodilla.rps;

import java.util.Scanner;

public class Reading {
    public static void main(String[] args)
    {
        Double d;
        String dane = "10,4 2,22  3,14 11,9956";
        Scanner skaner = new Scanner(dane);

        while(skaner.hasNextDouble()) {
            d = skaner.nextDouble();
            System.out.print(d + " ");
        }
    }
}
