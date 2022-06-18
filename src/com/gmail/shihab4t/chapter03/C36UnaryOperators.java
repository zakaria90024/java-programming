package com.gmail.shihab4t.chapter03;

public class C36UnaryOperators {
    public static void main(String[] args) {
        int result = +1;
        System.out.println("result = " + result);

        result--;
        System.out.println("result = " + result);

        result++;
        System.out.println("result = " + result);

        result = -result;
        System.out.println("result = " + result);


        int a = 5;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        // Difference between a++ and ++a;
        int x = 5;
        System.out.println("x = " + x);
        int y = x++; // post-increment
        System.out.println("y = " + y);
        
        int z = ++x; // pre-increment
        System.out.println("z = " + z);
        System.out.println("x = " + x);

    }
}
