package com.gmail.shihab4t.chapter13;

import java.time.ZoneOffset;

public class P10ZoneOffset {
    public static void main(String[] args) {
        ZoneOffset easternTimeZoneOffSet = ZoneOffset.of("-05:00");
        System.out.println("easternTimeZoneOffSet = " + easternTimeZoneOffSet);

        var tmp = ZoneOffset.of("-5");
        tmp = ZoneOffset.of("-05");
        tmp = ZoneOffset.of("-05:30");

        ZoneOffset utc = ZoneOffset.of("+0");
        System.out.println("utc = " + utc);

        ZoneOffset utcOffset = ZoneOffset.of("Z");
        System.out.println("utcOffset = " + utcOffset);
    }
}
