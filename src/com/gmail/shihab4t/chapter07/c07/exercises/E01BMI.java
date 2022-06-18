package com.gmail.shihab4t.chapter07.c07.exercises;

import java.text.DecimalFormat;

class BMI {
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight; // in pounds
    private double height; // in inches;

    // constructor
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public double getBMI() {
        DecimalFormat dec = new DecimalFormat("#0.00");
        return Double.parseDouble(dec.format(weight / (height * height) * 703));
    }

    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Overweight II)";
        }
    }

    public String getName() {
        return name;
    }
}

class BMITest {
    public static void main(String[] args) {
        BMI bmi = new BMI("Tanvir Rifat", 145, 70);
        System.out.println("The BMI for " + bmi.getName() + " is (" + bmi.getBMI() + ") " + bmi.getStatus());
    }
}
