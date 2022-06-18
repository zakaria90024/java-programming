package com.gmail.shihab4t.chapter08;

public class C07MultipleCatchDemo2 {
    public static void main(String[] args) {
        try {
            int numbers[] = new int[10];
            numbers[15] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            if (e instanceof ArithmeticException) {
                System.out.println("You can't divide by zero");
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("The index you tried to access does not exist");
            }
        }
    }
}
