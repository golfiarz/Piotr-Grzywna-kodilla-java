package com.kodilla.rps;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        Scanner write = new Scanner(System.in);
        System.out.println("What your name?");
        Player player = new Player(write.nextLine());
        System.out.println("Hello " + player + ". How many to wins we play?");
        int wins = write.nextInt();
        System.out.println("Ok, we play to" + wins + " wins. Let start!!!");
        Game game = new Game();
        game.Gameprocess(player, wins);

    }
}
