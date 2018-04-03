package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String move;
    int round = 1;
    boolean end = false;
    int playerPoints = 0;
    int computerPoints = 0;
    Random randomGenerator = new Random();

    public void processGame(Player player, int wins) {
        while (!end) {

            System.out.println("Round: " + wins + "!, Your move:");
            round++;

            move = new Scanner(System.in).nextLine();
            int computerMove = randomGenerator.nextInt(3) + 1;

            if (move.equals("1")) {
                if (computerMove == 1) {
                    System.out.println("rocks vs rock - draw");
                }
                if (computerMove == 2) {
                    System.out.println("rock vs paper - win computer");
                    computerPoints++;
                }
                if (computerMove == 3) {
                    System.out.println("rock vs scissors - win player");
                    playerPoints++;
                }
            } else if (move.equals("2")) {
                if (computerMove == 1) {
                    System.out.println("paper vs rock - win player");
                    playerPoints++;
                }
                if (computerMove == 2) {
                    System.out.println("paper vs paper - draw");
                }
                if (computerMove == 3) {
                    System.out.println("paper vs scissors - win computer");
                    computerPoints++;
                }
            } else if (move.equals("3")) {
                if (computerMove == 1) {
                    System.out.println("scissors vs rock - win computer");
                    computerPoints++;
                }
                if (computerMove == 2) {
                    System.out.println("scissors vs paper - win player");
                    playerPoints++;
                }
                if (computerMove == 3) {
                    System.out.println("scissors vs scissors - draw");
                }
            } else if (move.equals("x")) {
                System.out.println("Do you really want finish game? Chicken");
                move = new Scanner(System.in).nextLine();
                if (move.equals("y")) {
                    break;

                } else {

                    System.out.println("Play continue");
                    continue;
                }
            } else if (move.equals("n")) {
                System.out.println("Do you really want restart game? Looser");
                move = new Scanner(System.in).nextLine();
                if (move.equals("y")) {
                    playerPoints = 0;
                    computerPoints = 0;
                    round = 1;

                } else {
                    round = round - 1;
                    System.out.println("Play continue");
                }
            } else {
                System.out.println("Wrong input. Type again");
                continue;
            }

            System.out.println("Player have : " + playerPoints + " points. Computer have : " + computerPoints + " " +
                    "points");

            if (playerPoints == wins) {
                end = true;
                System.out.println(player.getName() + " win!!! Congratulation");
            }
            if (computerPoints == wins) {
                end = true;
                System.out.println("Computer win!!!. Try again");
            }
        }

    }
}
