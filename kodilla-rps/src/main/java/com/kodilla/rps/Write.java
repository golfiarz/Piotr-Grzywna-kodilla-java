package com.kodilla.rps;

import java.util.Scanner;

public class Write {
    public static void main(String[] args){
        String name;
        Scanner raeding = new Scanner(System.in);

        name = raeding.nextLine();
        System.out.println("Witaj" + name);
    }
}
