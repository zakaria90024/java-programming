package com.gmail.shihab4t.chapter13;

import java.time.ZoneId;

public class P11ZoneId {
    public static void main(String[] args) {
        ZoneId dhaka = ZoneId.of("Asia/Dhaka");
        System.out.println("dhaka = " + dhaka);
        
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println("defaultZoneId = " + defaultZoneId);

        var availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("\nAvailable ZoneIds: ");
        availableZoneIds.forEach(System.out::println);
    }
}
