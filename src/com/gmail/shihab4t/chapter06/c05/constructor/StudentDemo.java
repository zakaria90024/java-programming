package com.gmail.shihab4t.chapter06.c05.constructor;

public class StudentDemo {
    public static void main(String[] args) {
        Student inaiya = new Student("Inaiya", new double[]{97.45, 95.75, 100});

        double totalMarks = inaiya.totalMarks();
        double average = inaiya.average();

        System.out.println("Total marks = " + totalMarks);
        System.out.println("Average = " + average);
    }
}
