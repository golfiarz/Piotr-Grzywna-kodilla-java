package com.kodilla.rps;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) throws IOException {

        String player;
        char move;
        int round = 1;
        int wins = 0;
        boolean end = false;
        int playerPoints = 0;
        int computerPoints = 0;

        Scanner write = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.println("What your name?");
        player = write.nextLine();
        System.out.println("Hello " + player + ". How many round we play?");
        wins = write.nextInt();
        System.out.println("Ok, we play to" + wins + " wins. Let start!!!");

        while (!end) {

            System.out.println("Round: " + round + "!, Your move:");
            round++;
            
            move = (char) write.nextShort();
            int ran = randomGenerator.nextInt(3)+1;

            if (move == 1) {
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

            if (move == 2) {
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

            if (move == 3) {
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

            if (move == 4) {
                System.out.println("Do you really want finish game? Chicken");
                move = (char) write.nextShort();
                if (move == 6) {
                    end = true;
                } else {
                    round = round - 1;
                    System.out.println("Play continue");
                }
            }

            if (move == 5) {
                System.out.println("Do you really want restart game? Looser");
                move = (char) write.nextShort();
                if (move == 7) {
                    playerPoints = 0;
                    computerPoints = 0;
                    round = 1;
                    wins = 0;
                } else {
                    round = round - 1;
                    System.out.println("Play continue");
                }
            } else {
                round = round -1;
                System.out.println("Chose again");
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


