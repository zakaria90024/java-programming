package com.gmail.shihab4t.chapter14;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class P01String {
    public static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println("str = " + str);
        
        char[] helloArray = {'h', 'e', '0'};
        String helloString = new String(helloArray);
        System.out.println("helloString = " + helloString);
 
        byte[] data = new byte[] {(byte)97, (byte)98, (byte)99};
        String abc = new String(data, StandardCharsets.UTF_8);
        System.out.println("abc = " + abc);

        LocalDate localDate = LocalDate.now();
        String dateString = localDate.toString();
        System.out.println("dateString = " + dateString);
        
        String one = String.valueOf(1);
        System.out.println("one = " + one);
        String two = String.valueOf(2.384f);
        System.out.println("two = " + two);
        String notTrue = String.valueOf(false);
        System.out.println("notTrue = " + notTrue);
    }
}
