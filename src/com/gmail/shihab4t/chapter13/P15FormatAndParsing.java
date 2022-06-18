package com.gmail.shihab4t.chapter13;

import java.time.LocalDateTime;

public class P15FormatAndParsing {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formattedString = now.toString();
        System.out.println("formattedString = " + formattedString);
        
        LocalDateTime parsedDate = LocalDateTime.parse("2021-01-29T23:55:16.089056");
        System.out.println("parsedDate = " + parsedDate);
    }
}
