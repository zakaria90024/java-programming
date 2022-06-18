package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P13ArrayDeque {
    public static void main(String[] args) {
        String[] brackets = {"(()){}()", "({})", "({}(", "){})"};
        for (var bracket : brackets) {
            var isBalanced = isBalanced(bracket)
                    ? "Balanced": "not balanced";
            System.out.println(bracket + " is " + isBalanced);
        }
    }

    public static boolean isBalanced(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (var c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                deque.push(c);
            } else if (c == ']') {
                if (deque.isEmpty() || deque.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (deque.isEmpty() || deque.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (deque.isEmpty() || deque.pop() != '{') {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
