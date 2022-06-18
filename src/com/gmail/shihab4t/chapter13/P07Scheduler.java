package com.gmail.shihab4t.chapter13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class P07Scheduler {
    public static List<LocalDate> getSchedules(LocalDate startOfTheYear, LocalDate endOfTheYear, DayOfWeek dayOfWeek) {
        List<LocalDate> dates = new ArrayList<>();
        LocalDate date = startOfTheYear.with(TemporalAdjusters.nextOrSame(dayOfWeek));
        do {
            dates.add(date);
            date = date.plusWeeks(1);
        } while (date.isBefore(endOfTheYear));
        return dates;
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2021, Month.FEBRUARY, 28);
        
        List<LocalDate> schedules = getSchedules(start, end, DayOfWeek.MONDAY);

        System.out.println("schedules = " + schedules);
    }
}
