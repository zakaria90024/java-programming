package com.gmail.shihab4t.chapter16.appendix;

public class P18Formatting {
    public static void main(String[] args) {
        // Integer formatting
        System.out.printf("With of an integer %6d\n", 4);
        System.out.printf("With of an integer %-6d\n", 4);

        System.out.printf("With of an integer %06d\n", 4);
        System.out.printf("With of an integer %+06d\n", 4);
        System.out.printf("With of an integer %+06d\n", -4);

        System.out.printf("A floating-point %.2f\n", 4.121543);
        System.out.printf("number 1:%.2f\n", 4.121543);
        System.out.printf("number 2:%8.2f\n", 4.121543);
        System.out.printf("number 3:%8.4f\n", 4.121543);
        System.out.printf("number 1:%08.2f\n", 4.1215);
        
        
        String fox = "quick brown fox";
        String dog = "lazy dog";
        int times = 4;
        String format = String.format("This %s jumps over the %s %d times.\n", fox, dog, times);
        System.out.println("format = " + format);
    }
}
