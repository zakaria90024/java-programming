package com.gmail.shihab4t.chapter03;

public class C28StringOperation {
    public static void main(String[] args) {
        String nationalAnthemLineOne = "My Bengal of Precious Gold, I love you.";
        String nationalAnthemLineTwo = "Forever your skies, your air set my heart in tune\n" + "As if it were a flute.";


        // String Concatenation
        String nationalAnthem = nationalAnthemLineOne + nationalAnthemLineTwo;
        System.out.println(nationalAnthem);

        int hour = 4;
        String message = "We have been waiting here for over " + hour + " hours";
        System.out.println(message);

        System.out.println(5 + 3 + " Abcd");
        System.out.println(5 + 3 * 2 + " Abcd");
        System.out.println("Abcd " + 5 + 3);
        System.out.println("Abcd " + 5 + 3 * 2);
        System.out.println("Abcd " + (5 + 3 * 2));
        System.out.println("Result: " + (7 + 7 + 2 * 10 + 16));
    }
}
