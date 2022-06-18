package com.gmail.shihab4t.chapter06.c05.constructor;

public class Stack {
    private char[] data;
    private int capacity;
    private int top;

    public Stack(int capacity) {
        this.capacity = capacity;
        data = new char[capacity];
        top = -1;
    }

    boolean isEmpty() {
       if (top == -1) return true;
       return false;
    }

    void push(char c) {
        if (top == capacity - 1) {
            System.out.println("Error!: The stack is full");
        }
        top++;
        data[top] = c;
    }
    char pop() {
        if (isEmpty()) {
            System.out.println("Error!: The stack is empty");
        }
        char last = data[top];
        top--;
        return last;
    }

    char top() {
        if (isEmpty()) {
            System.out.println("Error!: The stack is empty");
        }
        return data[top];
    }

    int size() {
        return top + 1;
    }
}
