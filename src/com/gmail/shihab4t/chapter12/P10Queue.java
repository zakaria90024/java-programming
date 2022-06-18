package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P10Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 10; i >= 0; i--) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            Integer value =queue.poll();
            System.out.print(value + " ");
        }
    }
}
