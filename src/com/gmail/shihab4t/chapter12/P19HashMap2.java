package com.gmail.shihab4t.chapter12;

import java.util.*;

public class P19HashMap2 {
    public static void main(String[] args) {
        Map<Person, Address> addressBook = new HashMap<>();

        Person person = new Person("Bazlur");
        Address address = new Address(
                "500 Kingston Rd", "Toronto", "ON", "Canada", "M4L1V3"
        );

        addressBook.put(person, address);

        System.out.println(addressBook.get(person));


        Person person1 = new Person("Bazlur");
        Person person2 = new Person("Bazlur");

        if (person1.equals(person2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("They are not equal");
        }
        
        Map<Person, Address> addressBook2 = new HashMap<>();
        addressBook2.put(person1, address);
        addressBook2.put(person2, address);
        
        int size = addressBook2.size();
        System.out.println("size = " + size);
    }
}

class Person implements Comparable<Person>{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}

class Address {
    private final String streetName, city, province, country, postalCode;

    public Address(String streetName, String city, String province, String country, String postalCode) {
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}