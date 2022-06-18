package com.gmail.shihab4t.chapter03;

public class C32LogicalOperators {
    public static void main(String[] args) {

        // ! (not operator)
        System.out.println("! (not operator): ");
        int age = 15;
        boolean isOlderThan18 = age > 18;
        System.out.println("isOlderThan18 = " + isOlderThan18);
        boolean isNotOlderThan18 = !isOlderThan18;
        System.out.println("isNotOlderThan18 = " + isNotOlderThan18);

        // || (and operator)
        System.out.println("\n&& (and operator): ");
        boolean a = true;
        boolean b = true;
        System.out.println(a + " && " + b + " == " + (a && b));
        a = false;
        b = false;
        System.out.println(a + " && " + b + " == " + (a && b));
        a = true;
        b = false;
        System.out.println(a + " && " + b + " == " + (a && b));
        a = false;
        b = true;
        System.out.println(a + " && " + b + " == " + (a && b));

        // || (or operator)
        System.out.println("\n|| (or operator): ");
        a = true;
        b = true;
        System.out.println(a + " || " + b + " == " + (a || b));
        a = false;
        b = false;
        System.out.println(a + " || " + b + " == " + (a || b));
        a = true;
        b = false;
        System.out.println(a + " || " + b + " == " + (a || b));
        a = false;
        b = true;
        System.out.println(a + " || " + b + " == " + (a || b));

        // ^ (Exclusive or)
        System.out.println("\n^ (Exclusive or): ");
        a = true;
        b = true;
        System.out.println(a + " ^ " + b + " == " + (a ^ b));
        a = false;
        b = false;
        System.out.println(a + " ^ " + b + " == " + (a ^ b));
        a = true;
        b = false;
        System.out.println(a + " ^ " + b + " == " + (a ^ b));
        a = false;
        b = true;
        System.out.println(a + " ^ " + b + " == " + (a ^ b));
    }
}
