package com.gmail.shihab4t.chapter08.c09.exercises;

public class E03MustBePositive {
    public static void giveTwo(int a, int b) throws IllegalArgumentException {
        if (a < 1 || b < 1) {
            throw new IllegalArgumentException("Must be positive");
        }
    }

    public static void main(String[] args) {

//        giveTwo(-1, -2);

        try {
            giveTwo(-1, -2);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        System.out.println("Something");
    }
}
