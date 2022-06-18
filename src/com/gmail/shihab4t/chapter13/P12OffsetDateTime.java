package com.gmail.shihab4t.chapter13;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class P12OffsetDateTime {
    public static void main(String[] args) {
        ZoneOffset zoneOffset = ZoneOffset.of("+06:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
        System.out.println("offsetDateTime = " + offsetDateTime);
        
        ZoneOffset bdtOffSet = ZoneOffset.of("+06:00");
        OffsetDateTime now = OffsetDateTime.now(bdtOffSet);
        OffsetDateTime fiveDaysAhead = now.plusDays(5);
        System.out.println("fiveDaysAhead = " + fiveDaysAhead);
    }
}
