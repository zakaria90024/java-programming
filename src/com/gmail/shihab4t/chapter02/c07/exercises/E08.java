package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter wins: ");
        int wins = input.nextInt();

        System.out.print("Enter draws: ");
        int draws = input.nextInt();

        System.out.print("Enter losses: ");
        int losses = input.nextInt();

        int totalPoints = (wins * 3) + draws;
        System.out.println("Total Points = " + totalPoints);
    }
}
