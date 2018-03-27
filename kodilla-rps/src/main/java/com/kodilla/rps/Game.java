package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    String move;
    int round = 1;
    int wins = 0;
    boolean end = false;
    int playerPoints = 0;
    int computerPoints = 0;
    Random randomGenerator = new Random();

    public void Gameprocess(Player player, int wins){
        while (!end) {

            System.out.println("Round: " + wins + "!, Your move:");
            round++;

            move = new Scanner(System.in).nextLine();
            int ran = randomGenerator.nextInt(3)+1;

            if (move.equals("1")) {
                if (ran == 1) {
                    System.out.println("rocks vs rock - draw");
                }
                if (ran == 2) {
                    System.out.println("rock vs paper - win computer");
                    computerPoints++;
                }
                if (ran == 3) {
                    System.out.println("rock vs scissors - win player");
                    playerPoints++;
                }
            }

            if (move.equals("2")) {
                if (ran == 1) {
                    System.out.println("paper vs rock - win player");
                    playerPoints++;
                }
                if (ran == 2) {
                    System.out.println("paper vs paper - draw");
                }
                if (ran == 3) {
                    System.out.println("paper vs scissors - win computer");
                    computerPoints++;
                }
            }

            if (move.equals("3")) {
                if (ran == 1) {
                    System.out.println("scissors vs rock - win computer");
                    computerPoints++;
                }
                if (ran == 2) {
                    System.out.println("scissors vs paper - win player");
                    playerPoints++;
                }
                if (ran == 3) {
                    System.out.println("scissors vs scissors - draw");
                }
            }

            if (move.equals("x")) {
                System.out.println("Do you really want finish game? Chicken");
                move = new Scanner(System.in).nextLine();
                if (move.equals("y")) {
                    end = true;
                } else {
                    round = round - 1;
                    System.out.println("Play continue");
                }
            }

            if (move.equals("n")) {
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
            }

            System.out.println("Player have : " + playerPoints + "points. Computer have : " + computerPoints + " points");

            if (playerPoints == wins) {
                end = true;
                System.out.println("Player win!!! Congratulation");
            }
            if (computerPoints == wins) {
                end = true;
                System.out.println("Computer win!!!. Try again");
            }
        }

    }
}
