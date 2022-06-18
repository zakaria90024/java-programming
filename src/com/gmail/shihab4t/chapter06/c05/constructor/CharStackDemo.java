package com.gmail.shihab4t.chapter06.c05.constructor;

public class CharStackDemo {
    public static void main(String[] args) {
        CharStack stack = new CharStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.printElements();
        stack.pop();
        stack.pop();
        stack.printElements();
    }
}
