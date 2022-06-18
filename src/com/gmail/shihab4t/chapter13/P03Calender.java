package com.gmail.shihab4t.chapter13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class P03Calender {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2013, Calendar.FEBRUARY, 28, 13, 24, 56);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // jan = 0, dec = 11
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("dayOfMonth = " + dayOfMonth);
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("weekOfYear = " + weekOfYear);
        System.out.println("weekOfMonth = " + weekOfMonth);
    }
}
