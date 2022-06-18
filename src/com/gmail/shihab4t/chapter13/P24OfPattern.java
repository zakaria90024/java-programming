package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P24OfPattern {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String text = date.format(formatter);
        System.out.println("text = " + text);

        String text2 = "2021 01 30";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy MM dd");
        var parsedDate = LocalDate.parse(text2, formatter2);
        System.out.println("parsedDate = " + parsedDate);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }
}
