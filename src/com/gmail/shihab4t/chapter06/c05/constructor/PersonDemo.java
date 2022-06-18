package com.gmail.shihab4t.chapter06.c05.constructor;

public class PersonDemo {
    public static void main(String[] args) {
        Person shihab = new Person("Shihab Mahamud", "shiab4t@gmail.com", 18);

        shihab.printInfo();

        Person ahmed = new Person("Ahmed");

        ahmed.printInfo();
    }
}
