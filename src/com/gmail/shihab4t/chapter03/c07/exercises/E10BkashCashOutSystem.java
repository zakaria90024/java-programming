package com.gmail.shihab4t.chapter03.c07.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E10BkashCashOutSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        DecimalFormat decimalFormat = new DecimalFormat("৳#.##");

        System.out.println(decimalFormat.format(amount*(1.85/100)));
    }
}
