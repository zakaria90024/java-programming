package com.gmail.shihab4t.chapter14;

import java.util.Arrays;
import java.util.List;

public class P03StringMethods {
    public static void main(String[] args) {
        String loremIpsum = "Lorem ipsum dolor sit amet.";
        int len = loremIpsum.length();
        System.out.println("len = " + len);
        
        char charOfIndex2 = loremIpsum.charAt(2);
        System.out.println("charOfIndex2 = " + charOfIndex2);
    
        String lorem = loremIpsum.substring(0, 7);
        System.out.println("lorem = " + lorem);

        System.out.println(loremIpsum.toUpperCase());
        System.out.println(loremIpsum.toLowerCase());

        String country = "Bangladesh";
        System.out.println(country.indexOf('a'));
        System.out.println(country.indexOf("ng"));
        System.out.println(country.indexOf('a', 4));
        System.out.println(country.indexOf("ds", 5));
        
        String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        int lastIndexOfT = line.lastIndexOf('t');
        System.out.println("lastIndexOfT = " + lastIndexOfT);
        String subBookKeeper = "subbookkeeper";
        System.out.println(subBookKeeper.lastIndexOf("e"));
        System.out.println(subBookKeeper.lastIndexOf("e", 10));

        System.out.println("abc".equals("ABC"));
        System.out.println("ABC".equals("ABC"));
        System.out.println("abc".equalsIgnoreCase("ABC"));

        String name = "Bazlur Rahman Rokon";
        System.out.println(name.contains("Rahman"));
        System.out.println(name.startsWith("Sukumar"));
        System.out.println(name.endsWith("Roy"));

        String line2 = "Lorem ipsum dolor sit amet.";
        System.out.println(line.replace('o', 'X'));
        System.out.println(line.replace("dolor", "hello"));

        String helloWorld = "               hello World !                     ";
        System.out.println(helloWorld);
        System.out.println(helloWorld.length());
        System.out.println(helloWorld.trim());
        System.out.println(helloWorld.trim().length());
        
        String companyName = "Google,Amazon,Loblaw,SpaceX,Tesla,Yahoo,RBC";
        List<String> names = Arrays.asList(companyName.split(","));
        System.out.println("names = " + names);

        String java = "I love java\n";
        String repeated = java.repeat(5);
        System.out.println(repeated);


    }
}
