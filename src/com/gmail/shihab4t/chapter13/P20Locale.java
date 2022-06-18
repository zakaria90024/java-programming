package com.gmail.shihab4t.chapter13;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class P20Locale {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("defaultLocale = " + defaultLocale);
        
        Locale.setDefault(Locale.CHINA);

        ZonedDateTime today = ZonedDateTime.now();
        String timeMedium = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.LONG));
        System.out.println("timeMedium = " + timeMedium);


    }
}
