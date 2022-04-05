package com.infogalaxy;

import java.util.Random;

public class SnakeAndLaddersSimulator {
    int position = 0;
    int dice;

    //Showing Current Position of player
    public void position() {

        System.out.println("Players Position is = " + position);
    }

    //Rollling the Dice to Get Position
    public void rollsDice() {
        dice = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Dice Number is = " + dice);
    }

    //UC-3-Checking for Option to Play
    public void checkOption() {
        int option = (int) ((Math.random() * 3 - 1) + 1);
        System.out.println("Option Number = " + option);
        Constants constants = new Constants();
        switch (option) {
            case Constants.NO_PLAY:
                System.out.println("No Play Arrived. Stay Same Position...");
                break;
            case Constants.LADDER:
                System.out.println("HURRAY..! U Got Ladder..");
                position = position + dice;
                break;
            case Constants.SNAKE:
                if (position < 0) {
                    position = -(position);
                }
                System.out.println("OOPS.. U Got Snake..");
                break;
        }
    }

    public static void main(String[] args) {
        //Creating Snake and Laader Object
        SnakeAndLaddersSimulator player1 = new SnakeAndLaddersSimulator();

        //Showing Snake and Ladder Position
        player1.position();

        //Rollinng the Dice
        player1.rollsDice();

        //Checking Option
        player1.checkOption();
        player1.position();
    }
}
