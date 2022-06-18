package com.gmail.shihab4t.chapter04;

public class C20HalfPyramidWithNestedForLoop {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
