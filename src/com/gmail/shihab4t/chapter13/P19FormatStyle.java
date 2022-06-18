package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class P19FormatStyle {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        
        String fullDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("fullDate = " + fullDate);
        
        String longDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("longDate = " + longDate);
        
        String mediumDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("mediumDate = " + mediumDate);
        
        String shortDate = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("shortDate = " + shortDate);


        LocalTime timeNow = LocalTime.now();
        
        String mediumTimeNow = timeNow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println("mediumTimeNow = " + mediumTimeNow);
        
        String shortTimeNow = timeNow.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println("shortTimeNow = " + shortTimeNow);


        LocalDateTime today2 = LocalDateTime.now();

        String timeMedium = today2.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println("timeMedium = " + timeMedium);


        ZonedDateTime today3 = ZonedDateTime.now();

        String timeMedium2 = today3.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        System.out.println("timeMedium2 = " + timeMedium2);

        String timeDate = today3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.LONG));
        System.out.println("timeDate = " + timeDate);


    }
}
