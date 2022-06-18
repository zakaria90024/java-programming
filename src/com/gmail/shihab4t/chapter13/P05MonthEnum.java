package com.gmail.shihab4t.chapter13;

import java.time.Month;

public class P05MonthEnum {
    public static void main(String[] args) {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month);
        }
    }
}
