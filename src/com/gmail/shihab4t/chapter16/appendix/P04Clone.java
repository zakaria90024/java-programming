package com.gmail.shihab4t.chapter16.appendix;

public class P04Clone {
    public static void main(String[] args) {
        P03Person person1 = new P03Person("James", "Gosling");

        System.out.println("Person #1: " + person1.getFullName());

        try  {
            P03Person person2 = (P03Person) person1.clone();
            System.out.println("Person #2: " + person2.getFullName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
