package com.gmail.shihab4t.chapter13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class P23ParsedWithFactoryMethods {
    public static void main(String[] args) {
        String date = "May 8, 2021, 1:12:26 a.m. BDT";
        LocalDateTime parsed = LocalDateTime.parse(date, DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.LONG));
        System.out.println("parsed = " + parsed);
    }
}
