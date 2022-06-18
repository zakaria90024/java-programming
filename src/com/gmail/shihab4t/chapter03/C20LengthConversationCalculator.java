package com.gmail.shihab4t.chapter03;

import java.util.Scanner;

public class C20LengthConversationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length in inch: ");
        double inch = input.nextDouble();

        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
