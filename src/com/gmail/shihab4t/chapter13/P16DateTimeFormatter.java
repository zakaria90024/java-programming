package com.gmail.shihab4t.chapter13;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class P16DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String isoDate = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println("isoDate = " + isoDate);

        String formattedTime = now.format(DateTimeFormatter.ISO_TIME);
        System.out.println("formattedTime = " + formattedTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        String zonedDateTimeFormatted = zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println("zonedDateTimeFormatted = " + zonedDateTimeFormatted);

        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimeFormatted = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("localDateTimeFormatted = " + localDateTimeFormatted);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        String offsetDateFormatted = offsetDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println("offsetDateFormatted = " + offsetDateFormatted);
    }
}
