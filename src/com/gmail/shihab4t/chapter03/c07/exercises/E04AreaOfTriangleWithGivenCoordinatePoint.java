package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E04AreaOfTriangleWithGivenCoordinatePoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x, y of A (like: 2 3): ");
        double ax, ay;
        ax = input.nextInt();
        ay = input.nextInt();

        System.out.print("Enter x, y of B (like: 2 3): ");
        double bx, by;
        bx = input.nextInt();
        by = input.nextInt();

        System.out.print("Enter x, y of C (like: 2 3): ");
        double cx, cy;
        cx = input.nextInt();
        cy = input.nextInt();

        Double area = (1 / 2) * Math.abs((ax * (by - cy)) + (bx * (cy-ay)) + cx * (ay - by));

        System.out.println("area = " + area);
    }
}
