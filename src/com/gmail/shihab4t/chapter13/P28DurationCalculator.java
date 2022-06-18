package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class P28DurationCalculator {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        var input = new Scanner(System.in);

        try {
            System.out.println("Enter start date (MM/dd/yyyy):");
            var first = input.nextLine();
            var startDate = LocalDate.parse(first, formatter);

            System.out.println("Enter end Date (MM/dd/yyyy): ");
            var second = input.nextLine();
            var endDate = LocalDate.parse(second, formatter);

            var period = Period.between(startDate, endDate);
            System.out.println("It is " + period.getYears() + " years, "
                + period.getMonths() + " months and "
                + period.getDays() + " days.");
        } catch (DateTimeParseException e) {
            e.printStackTrace();
            System.out.println("Invalid Date, " + "please use proper format");
        }
    }
}
