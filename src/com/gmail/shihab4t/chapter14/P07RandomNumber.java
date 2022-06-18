package com.gmail.shihab4t.chapter14;

import java.util.Random;

public class P07RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int aRandomNumber = random.nextInt();
        System.out.println("aRandomNumber = " + aRandomNumber);

        int min = 10;
        int max = 20;
        int aRandomNumber2 = random.nextInt(max - min + 1);
        System.out.println("aRandomNumber2 = " + aRandomNumber2);
    }
}
