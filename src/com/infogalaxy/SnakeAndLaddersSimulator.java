package com.infogalaxy;

import java.util.Random;

public class SnakeAndLaddersSimulator {
    public void position() {
        int position = 0;
        System.out.println("Players Position is = " + position);
    }

    public void rollsDie() {
        Random random = new Random();
        int dies = (int) (Math.random() * (6 - 1) + 1);
        System.out.println("Die Number is = " + dies);
    }

    public static void main(String[] args) {
        SnakeAndLaddersSimulator player1 = new SnakeAndLaddersSimulator();

        player1.position();
        player1.rollsDie();
    }
}
