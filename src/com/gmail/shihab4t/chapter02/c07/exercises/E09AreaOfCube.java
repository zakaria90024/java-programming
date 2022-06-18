package com.gmail.shihab4t.chapter02.c07.exercises;

import java.util.Scanner;

public class E09AreaOfCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.print("Enter height: ");
        int height = input.nextInt();

        int volume = length * width * height;

        System.out.println("Volume = " + volume);
    }
}
