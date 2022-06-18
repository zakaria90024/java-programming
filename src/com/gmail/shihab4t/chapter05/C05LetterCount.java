package com.gmail.shihab4t.chapter05;

import java.util.Locale;
import java.util.Scanner;

public class C05LetterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter characters: ");

        String inputValue = input.nextLine();
        inputValue = inputValue.toLowerCase(Locale.ROOT);
        char[] letters = inputValue.toCharArray();

        int[] counts = new int[26];

        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (Character.isLetter(letter)) {
                int indx = letter - 'a';
                counts[indx]++;
            }
        }

        System.out.println("Letter counts: ");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + ": " + counts[i]);
            }
        }
    }
}
