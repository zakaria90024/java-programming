package com.gmail.shihab4t.chapter13;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class P22BangladeshLocale {
    public static void main(String[] args) {
        Locale bangladeshLocale = new Locale("bn");
        Locale.setDefault(bangladeshLocale);

        ZonedDateTime today = ZonedDateTime.now();
        String time = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.LONG));
        System.out.println("time = " + time);
        
        String inBangla = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("inBangla = " + inBangla);
    }
}
