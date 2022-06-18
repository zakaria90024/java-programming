package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Scanner;

public class E10StoreTheTemperatureOfBarguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature of Barguna Full year: ");
        int[][] temps = new int[64][365];
        for (int i = 0; i < 64; i++) {
            for (int j = 0; j < 365; j++) {
                System.out.print("For Day " + (j + 1) + ": ");
                temps[i][j] = input.nextInt();
            }
        }
    }
}
