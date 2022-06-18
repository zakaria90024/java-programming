package com.gmail.shihab4t.chapter14;

public class P04StringPool {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcd";

        String usingLiteral = "str";  // it is in the string pool
        String newString = new String(usingLiteral);  // not in the string pool
    }
}
