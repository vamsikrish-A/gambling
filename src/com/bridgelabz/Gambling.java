package com.bridgelabz;

import java.util.Random;

public class Gambling {
    public static final int STAKEPERDAY = 100;
    public static final int BETPERGAME = 1;
    public static final float STAKE_VALUE = 0.5f;
    public static int wonAmount, losingAmount, stake;

    public static void WINORLOOSE() {
        Random random = new Random();
        int value = random.nextInt(2);
        if (value == 1) {
            System.out.println("Gambler won");
            stake++;
        } else {
            System.out.println("Gambler lose");
            stake--;
        }
    }

    public int resignStake() {
       losingAmount = (int) Math.round(STAKEPERDAY * STAKE_VALUE);
       wonAmount = (int) Math.round(STAKEPERDAY +(STAKEPERDAY * STAKE_VALUE));
       boolean stop = true;
       stake = STAKEPERDAY;
       while (stop == true) {
           WINORLOOSE();
           if (stake == losingAmount) {
               stop = false;
           }
           if (stake == wonAmount) {
               stop = false;
           }
       }
       return stake;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Gambling simulator");
        Gambling simulator = new Gambling();
        simulator.resignStake();

    }
}
