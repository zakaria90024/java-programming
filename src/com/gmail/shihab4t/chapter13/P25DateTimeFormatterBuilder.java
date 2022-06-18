package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

public class P25DateTimeFormatterBuilder {
    public static void main(String[] args) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        DateTimeFormatter formatter = dateTimeFormatterBuilder
                .appendValue(ChronoField.YEAR, 4)
                .appendLiteral(" ")
                .appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL)
                .appendLiteral(" ")
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .toFormatter();
        String date = "2020 January 30";

        LocalDate parsedDate = LocalDate.parse(date, formatter);
        System.out.println("parsedDate = " + parsedDate);
    
    
        var builder = new DateTimeFormatterBuilder();
        var formatter1 = builder.append(DateTimeFormatter.ISO_DATE)
                .appendLiteral(" is ")
                .appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL)
                .toFormatter();
        
        LocalDate today = LocalDate.now();
        String formattedText = today.format(formatter1);
        System.out.println("formattedText = " + formattedText);
    }
}
