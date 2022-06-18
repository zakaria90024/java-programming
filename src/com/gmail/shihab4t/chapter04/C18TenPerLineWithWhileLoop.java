package com.gmail.shihab4t.chapter04;

public class C18TenPerLineWithWhileLoop {
    public static void main(String[] args) {
        int i = 1, j;
        while (i <= 500) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
