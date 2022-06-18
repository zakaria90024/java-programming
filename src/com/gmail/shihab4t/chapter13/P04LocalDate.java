package com.gmail.shihab4t.chapter13;

import java.time.LocalDate;
import java.time.Month;

public class P04LocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        
        LocalDate firstPublished = LocalDate.of(2017, Month.FEBRUARY, 14);
        System.out.println("firstPublished = " + firstPublished);
    }
}
