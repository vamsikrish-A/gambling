package com.bridgelabz;

public class Gambling {
    public static final int STAKEPERDAY = 100;
    public static final int BETPERGAME = 1;
    public static final int WIN = 1;

    public static void WINORLOOSE() {
        double result = Math.floor(Math.random() * 10) % 2;
         if (result == WIN)
             System.out.println("You WON.");
         else
             System.out.println("you loose.");

    }


    public static void main(String[] args) {
        System.out.println("Welcome to Gambling simulator");
        WINORLOOSE();
    }
}
