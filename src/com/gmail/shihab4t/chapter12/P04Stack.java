package com.gmail.shihab4t.chapter12;

import java.util.Stack;

public class P04Stack {
    public static void main(String[] args) {
        String[] brackets = {"(()){}()", "({})", "({}(", "){})"};
        for (var bracket : brackets) {
            var isBalanced = isBalanced(bracket)
                    ? "Balanced": "not balanced";
            System.out.println(bracket + " is " + isBalanced);
        }
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (var c : input.toCharArray()) {
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
