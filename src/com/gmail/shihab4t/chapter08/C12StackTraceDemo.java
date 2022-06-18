package com.gmail.shihab4t.chapter08;

class C12StackTraceDemo {
    public static void main(String[] args) {
        C12StackTraceDemo stackTraceDemo = new C12StackTraceDemo();
        stackTraceDemo.methodA();
    }

    public void methodA() {
        methodB();
    }

    public void methodB() {
        methodC();
    }

    public void methodC() {
        methodD();
    }

    public void methodD() {
        methodE();
    }

    public void methodE() {
        methodF();
    }

    public void methodF() {
        throw new RuntimeException("Exception");
    }
}
