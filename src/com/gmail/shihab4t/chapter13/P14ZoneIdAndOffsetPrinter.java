package com.gmail.shihab4t.chapter13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class P14ZoneIdAndOffsetPrinter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        ZoneId.getAvailableZoneIds().forEach(zoneId -> {
            ZoneId id = ZoneId.of(zoneId);
            ZonedDateTime zonedDateTime = now.atZone(id);
            ZoneOffset zoneOffset = zonedDateTime.getOffset();
            String offset  = zoneOffset.getId().replaceAll("Z", "+00:00");
            System.out.printf("%35s (UTC%s) %n", id.toString(), offset);
        });
    }
}
