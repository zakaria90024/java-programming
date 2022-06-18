package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class P18FactoryMethods {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        String formattedDate = today.format(dateTimeFormatter);
        System.out.println("formattedDate = " + formattedDate);
    }
}
