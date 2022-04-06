package com.infogalaxy;


public class SnakeAndLaddersSimulator {

    int position = 0;
    int dice;

    //UC-1-Showing Current Position of player
    public void position() {

        System.out.println("Players Position is = " + position);
    }

    //UC-2-Rollling the Dice to Get No Between 1 to 6
    public void rollsDice() {
        //UC-4-Repeate Till the Player Reaches Winning Position 100
        while (position <= 100) {
            dice = (int) ((Math.random() * (7 - 1)) + 1);
            System.out.println("Dice Number is = " + dice);

            //UC-3-Checking for Option to Play
            int option = (int) ((Math.random() * (3 - 1)) + 1);
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
            position();
        }
    }

    public static void main(String[] args) {
        //Creating Snake and Ladder Object
        SnakeAndLaddersSimulator player1 = new SnakeAndLaddersSimulator();

        //Showing Snake and Ladder Position
        player1.position();
        //Rollinng the Dice
        player1.rollsDice();

    }
}
