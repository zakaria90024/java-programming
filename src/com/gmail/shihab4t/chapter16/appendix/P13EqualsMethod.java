package com.gmail.shihab4t.chapter16.appendix;

public class P13EqualsMethod {
    public static void main(String[] args) {
        P03Person person1 = new P03Person("Shihab", "Mahamud");
        P03Person person2 = new P03Person("Shihab", "Mahamud");

        boolean equals = person1.equals(person2);
        System.out.println(equals);
    }
}
