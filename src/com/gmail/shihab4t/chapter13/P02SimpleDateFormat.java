package com.gmail.shihab4t.chapter13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P02SimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        Date now = new Date();

        var formattedDateTime = sdf.format(now);

        System.out.println("formattedDateTime = " + formattedDateTime);
    }
}
