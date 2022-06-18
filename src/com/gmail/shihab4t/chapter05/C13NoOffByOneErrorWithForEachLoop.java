package com.gmail.shihab4t.chapter05;

public class C13NoOffByOneErrorWithForEachLoop {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
