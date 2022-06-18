package com.gmail.shihab4t.chapter05;

import java.util.Scanner;

public class C06StringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println("value = " + value);
    }
}
