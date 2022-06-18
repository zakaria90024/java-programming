package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P12Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i  = 0; i < 10; i++) {
            deque.push(i);
        }

        while (!deque.isEmpty()) {
            var value =deque.pop();
            System.out.println("value = " + value);
        }
    }
}
