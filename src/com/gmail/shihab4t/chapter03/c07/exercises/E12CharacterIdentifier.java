package com.gmail.shihab4t.chapter03.c07.exercises;

import java.util.Scanner;

public class E12CharacterIdentifier {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner input = new Scanner(System.in);

        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a letter");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        }
        else {
            System.out.println(ch + " is symbol");
        }
    }
}
