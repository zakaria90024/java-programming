package com.gmail.shihab4t.chapter16.appendix;

public class P05Student {
    private String firstName, lastName;

    public P05Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void updateName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        P05Student student1 = new P05Student("Niaz", "Murshed");
        System.out.println("student #1 = " + student1.getFullName());

        P05Student student2 = student1;
        System.out.println("student #2 = " + student2.getFullName());

        student2.updateName("James", "Gosling");

        System.out.println("student #1 = " + student1.getFullName());
        System.out.println("student #2 = " + student2.getFullName());
    }
}
