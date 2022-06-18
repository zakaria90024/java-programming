package com.gmail.shihab4t.chapter05.c05.exercises;

import java.util.Scanner;

public class E11CountriesMoneyLanguage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] countries = new String[10][4];

        countries[0][0] = "Bangladesh";
        countries[0][1] = "Dhaka";
        countries[0][2] = "Taka";
        countries[0][3] = "Bangla";

        countries[1][0] = "Idia";
        countries[1][1] = "Delhi";
        countries[1][2] = "Rupee";
        countries[1][3] = "Hindi";

        String str;

        int correct = 0, wrong = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("Q: What is the capital of " + countries[i][0] + "?");
            str = input.nextLine();
            if (str.equals(countries[i][1])) {
                correct++;
                System.out.println("Well done!");
            } else {
                wrong++;
                System.out.println("The correct answer should be " + countries[i][1]);
            }

            System.out.println("Q: What is the currency of Bangladesh?");
            str = input.nextLine();
            if (str.equals(countries[i][2])) {
                correct++;
                System.out.println("Well done!");
            } else {
                wrong++;
                System.out.println("The correct answer should be " + countries[i][2]);
            }

            System.out.println("Q: What is the official language of Bangladesh?");
            str = input.nextLine();
            if (str.equals(countries[i][3])) {
                correct++;
                System.out.println("Well done!");
            } else {
                wrong++;
                System.out.println("The correct answer should be " + countries[i][3]);
            }
        }

        System.out.println("\nTotal correct answer: " + correct);
        System.out.println("Total wrong answer: " + wrong);
    }
}
