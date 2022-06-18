package com.gmail.shihab4t.chapter08;

class C13MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        methodA();
        System.out.println("Exiting Main method");
    }

    public static void methodA() {
        System.out.println("Inside method A");
        methodB();
        System.out.println("Exiting method A");
    }

    public static void methodB() {
        System.out.println("Inside method B");
        methodC();
        System.out.println("Exiting method B");
    }

    public static void methodC() {
        System.out.println("Inside method C");
        methodD();
        System.out.println("Exiting method B");
    }

    public static void methodD() {
        System.out.println("Inside method D");
        methodE();
        System.out.println("Exiting method D");
    }

    public static void methodE() {
        System.out.println("Inside method E");
        methodF();
        System.out.println("Exiting method E");
    }

    public static void methodF() {
        System.out.println("Inside method F");
        System.out.println(5 / 0);
        System.out.println("Exiting method F");
    }
}
