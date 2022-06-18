package com.gmail.shihab4t.chapter13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class P06LocalDateManipulation {
    public static void main(String[] args) {
        LocalDate firstDayOf2021 = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate programmersDay = firstDayOf2021.plusDays(255);
        System.out.println("Next programmers Day = " + programmersDay);

        LocalDate today = LocalDate.of(2021, Month.MAY, 1);
        System.out.println("today = " + today);
        LocalDate withDay15 = today.withDayOfMonth(15);
        System.out.println("withDay15 = " + withDay15);

        LocalDate today2 = LocalDate.now();
        int dayOfMonth = today2.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
    
        LocalDate dec292021 = LocalDate.of(2021, Month.DECEMBER, 29);
        int dayOfYear = dec292021.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);
        
        DayOfWeek dayOfWeek = today2.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        
        Month month = today2.getMonth();
        System.out.println("month = " + month);

        LocalDate motherLanguageDay = LocalDate.of(2021, Month.FEBRUARY, 21);
        Period until = today2.until(motherLanguageDay);
        int days = until.getDays();
        int months = until.getMonths();
        System.out.printf("%d month(s) and %d day(s) left until international mother language day\n", months, days);

        LocalDate tomorrow = today2.plusDays(1);
        boolean todayIsBeforeTomorrow = today2.isBefore(tomorrow);
        System.out.println("todayIsBeforeTomorrow = " + todayIsBeforeTomorrow);
        boolean tomorrowIsAfterToday = tomorrow.isAfter(today);
        System.out.println("tomorrowIsAfterToday = " + tomorrowIsAfterToday);
    
        LocalDate year2020 = LocalDate.of(2020, Month.JANUARY, 2);
        boolean leapYear = year2020.isLeapYear();
        System.out.println("leapYear = " + leapYear);
    }
}
