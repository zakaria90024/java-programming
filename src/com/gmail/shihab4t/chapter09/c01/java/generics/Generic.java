package com.gmail.shihab4t.chapter09.c01.java.generics;

public class Generic<T> {
    private T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void showType() {
        System.out.println("Type of T: " + obj.getClass().getName());
    }
}
