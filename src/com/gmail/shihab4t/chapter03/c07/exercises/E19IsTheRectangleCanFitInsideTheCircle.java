package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E19IsTheRectangleCanFitInsideTheCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter radius: ");
        int radius = input.nextInt();

        int max;
        if (height < width) {
            max = width;
        }
        else {
            max = height;
        }

        if (max <= radius * 2) {
            System.out.println("The rectangle can fit inside the circle.");
        }
        else {
            System.out.println("The rectangle can not fit inside the circle.");
        }
    }
}
