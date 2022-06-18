package com.gmail.shihab4t.chapter16.appendix;

public class P03Person implements Cloneable{
    private String firstName, lastName;

    public P03Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    protected Object clone() throws  CloneNotSupportedException {
        return super.clone();
    }
}
