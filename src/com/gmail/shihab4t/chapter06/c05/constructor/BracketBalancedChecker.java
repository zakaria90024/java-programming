package com.gmail.shihab4t.chapter06.c05.constructor;

public class BracketBalancedChecker {
    public boolean isBalanced(String input) {
        int len = input.length();
        CharStack stack = new CharStack();
        for (var iTh : input.toCharArray()) {
            if (iTh == '(') {
                stack.push(iTh);
            } else if (iTh == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
