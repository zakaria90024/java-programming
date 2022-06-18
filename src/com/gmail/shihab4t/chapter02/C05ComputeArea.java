package com.gmail.shihab4t.chapter02;

import java.util.Scanner;

public class C05ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        double area = radius * radius * 3.14159;

        System.out.println("Area = " + area);
    }
}
