package com.gmail.shihab4t.chapter13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P17ParseDateTime {
    public static void main(String[] args) {
        String date = "2021-01-30T04:20:08";
        LocalDateTime parsedDate = LocalDateTime.parse(date, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("parsedDate = " + parsedDate);
    }
}
