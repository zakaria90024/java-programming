package com.gmail.shihab4t.chapter07.c07.exercises;

class Author {
    private String name;
    private String email;
    private String gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int inStock;

    public Book(String name, Author author, double price, int inStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }
}

class Main {
    public static void main(String[] args) {
        Author author = new Author("Tamim Shahriar Subeen", "book@subeen.com", "M");
        Book book = new Book("Computer Programming", author, 250, 1000);

        System.out.println("Name of the Book: " + book.getName());
        System.out.println("Name of the Author: " + book.getAuthor());
        System.out.println("Available in stock: " + book.getInStock());
    }
}