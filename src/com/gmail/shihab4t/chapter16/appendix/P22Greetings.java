package com.gmail.shihab4t.chapter16.appendix;

public class P22Greetings {
    int count;

    public void great() {
        if (count == 1_000) {
            return;
        }
        System.out.println("Hello, world!");
        count++;

        great();
    }

    public static void main(String[] args) {
        P22Greetings greetings = new P22Greetings();
        greetings.great();
    }
}
