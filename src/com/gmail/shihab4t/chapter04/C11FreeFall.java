package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C11FreeFall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day between (1 to 7)");
        int day = input.nextInt();

        switch (day) {
        case 1:
            System.out.println("MonDay");
        case 2:
            System.out.println("TuesDay");
        case 3:
            System.out.println("WednesDay");
        case 4:
            System.out.println("ThursDay");
        case 5:
            System.out.println("FriDay");
        case 6:
            System.out.println("SaturDay");
        case 7:
            System.out.println("SunDay");
        }
    }
}
