package com.gmail.shihab4t.chapter16.appendix;

import java.util.Objects;

public class P14Person {
    private String firstName, lastName;

    public P14Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof P14Person p14Person)) return false;
        return firstName.equals(p14Person.firstName) && lastName.equals(p14Person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
