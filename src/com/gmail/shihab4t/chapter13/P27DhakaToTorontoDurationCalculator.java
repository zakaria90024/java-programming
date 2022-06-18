package com.gmail.shihab4t.chapter13;

import java.time.*;

public class P27DhakaToTorontoDurationCalculator {
    public static void main(String[] args) {
        var dhakaTimeZone = ZoneId.of("Asia/Dhaka");
        var torontoTimeZone = ZoneId.of("Canada/Eastern");

        var localTakeOffTime = LocalDateTime.of(2021, Month.FEBRUARY, 7, 10, 5);
        var zonedTakeOffTime = ZonedDateTime.of(localTakeOffTime, dhakaTimeZone);

        var localArrivalTime = LocalDateTime.of(2021, Month.FEBRUARY, 8, 14, 30);
        var zonedArrivalTime = ZonedDateTime.of(localArrivalTime, torontoTimeZone);

        var flightDuration = Duration.between(zonedTakeOffTime, zonedArrivalTime);
        var hours = flightDuration.toHours();
        var minutesPart = flightDuration.toMinutesPart();

        System.out.printf("Total Duration: %d hours %d minutes", hours, minutesPart);
    }
}
