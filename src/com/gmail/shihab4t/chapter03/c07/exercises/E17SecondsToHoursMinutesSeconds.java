package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E17SecondsToHoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int time = input.nextInt();
        int second = time % 60;
        time /= 60;
        int minute = time % 60;
        time /= 60;
        int hour = time;
        System.out.println( hour + " hour(s), " + minute +  " minutes(s) " + second + " second(s)");
    }
}
