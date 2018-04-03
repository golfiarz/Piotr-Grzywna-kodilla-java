package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner write = new Scanner(System.in);
        System.out.println("What your name?");
        Player player = new Player(write.nextLine());
        System.out.println("Hello " + player.getName() + ". How many rounds we play?");

        try {
            int wins = write.nextInt();
            System.out.println("Ok, we play to " + wins + " wins. Let start!!!");
            Game game = new Game();
            game.processGame(player, wins);

        } catch (InputMismatchException e) {
            System.out.println("Wrong input. Sorry !");
        }

        System.out.println("Game finished");
    }
}
