package com.gmail.shihab4t.chapter04;

import java.util.Scanner;

public class C16TimeTableWithWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = input.nextInt();

        System.out.println(x + " times table: ");
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + x + " = " + i * x);
            i++;
        }
    }
}
