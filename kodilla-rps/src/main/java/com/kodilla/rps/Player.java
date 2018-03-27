package com.kodilla.rps;

import java.util.Scanner;

public final class Player {
    private  String name;

    Scanner write = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
