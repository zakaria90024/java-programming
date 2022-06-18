package com.gmail.shihab4t.chapter08;

public class C06MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int numbers[] = new int[10];
            numbers[15] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index you tried to access does not exist");
        }
    }
}
