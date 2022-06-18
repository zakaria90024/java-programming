package com.gmail.shihab4t.chapter16.appendix;

import java.util.Objects;

public class P15EmployeeHashCodeMethod {
    private String id, firstName, lastName;

    public P15EmployeeHashCodeMethod(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof P15EmployeeHashCodeMethod)) return false;
        P15EmployeeHashCodeMethod that = (P15EmployeeHashCodeMethod) o;
        return Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
