package com.gmail.shihab4t.chapter14;

public class P06MathAPI {
    public static void main(String[] args) {
        int a = 10;
        int b = -19;
        double x = 152.3;
        double y = 0.349;

        // absolute value
        System.out.println("|" + a + " | is " + Math.abs(a));
        System.out.println("|" + b + " | is " + Math.abs(b));
        System.out.println("|" + x + " | is " + Math.abs(x));
        System.out.println("|" + y + " | is " + Math.abs(y));

        // sqrt(x)
        int p = 2;
        System.out.println("The square root of " + p + " is " + Math.sqrt(p));

        // Rounding functions
        System.out.println(x + " is approximately " + Math.round(x));
        System.out.println(y + " is approximately " + Math.round(y));

        // The ceiling and floor of number
        System.out.println("The ceiling of " + a + " is " + Math.ceil(a));
        System.out.println("The floor of " + a + " is " + Math.floor(a));

        // Comparison operators
        // min
        System.out.println("min {" + a + "," + b + "} is " + Math.min(a, b));
        // max
        System.out.println("max {" + a + "," + b + "} is " + Math.max(a, b));

        // PI & E
        System.out.println("Pi is" + Math.PI);
        System.out.println("e is" + Math.E);

        // trigonometric operations
        // all arguments are given in radians
        // Convert a 45 degree angle to radians
        double angle = 45.0 * 2.0 * Math.PI / 360.0;
        System.out.println("cos(" + angle + ") is " + Math.cos(angle));
        System.out.println("sin(" + angle + ") is " + Math.sin(angle));
        // Inverse Trigonometric operations
        // All values are returned as radians
        double value = 0.707;
        System.out.println("acos(" + value + ") is " + Math.acos(value));
        System.out.println("asin(" + value + ") is " + Math.asin(value));
        System.out.println("atan(" + value + ") is " + Math.atan(value));

        // Exponential and Logarithmic
        // exp(a)
        System.out.println("exp(1.0) is " + Math.exp(1.0));
        System.out.println("exp(10.0) is " + Math.exp(10.0));
        System.out.println("exp(0.0) is " + Math.exp(0.0));
        // log(a)
        System.out.println("log(1.0) is " + Math.log(1.0));
        System.out.println("log(10.0) is " + Math.log(10.0));
        System.out.println("log(Math.E) is " + Math.log(Math.E));
        // pow(x, y)
        System.out.println("pow(2.0, 2.0) is " + Math.pow(2.0, 2.0));
        System.out.println("pow(10.0, 4) is " + Math.pow(10.0, 4));
        System.out.println("pow(8, -1) is " + Math.pow(8, -1));
    }
}
