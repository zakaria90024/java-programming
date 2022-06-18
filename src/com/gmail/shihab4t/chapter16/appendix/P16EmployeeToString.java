package com.gmail.shihab4t.chapter16.appendix;

public class P16EmployeeToString {
    private String name;
    private int age;

    public P16EmployeeToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        P16EmployeeToString employee = new P16EmployeeToString("Abdur Rahim", 27);
        System.out.println(employee.toString());
    }
}
