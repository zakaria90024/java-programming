package com.gmail.shihab4t.chapter06.c05.constructor;

public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push('a');

        st.push('d');

        System.out.println(st.size());


        System.out.println(st.pop());
        System.out.println(st.top());


        System.out.println(st.isEmpty());
    }
}
