package com.gmail.shihab4t.chapter03;

public class C14NumberSystemConversion {
    public static void main(String[] args) {
        int number = 1_000_000; // 1 million

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        String octal = Integer.toOctalString(number);

        System.out.println("binary = " + binary);
        System.out.println("hex = " + hex);
        System.out.println("octal = " + octal);
    }
}
