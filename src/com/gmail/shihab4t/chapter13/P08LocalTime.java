package com.gmail.shihab4t.chapter13;

import java.time.LocalTime;

public class  P08LocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        LocalTime eightOClock = LocalTime.of(8, 0);
        System.out.println("eightOClock = " + eightOClock);
        
        LocalTime bedTime = LocalTime.of(22, 30);
        LocalTime wakeUpTime = bedTime.plusHours(8);
        System.out.println("wakeUpTime = " + wakeUpTime);
    }
}
