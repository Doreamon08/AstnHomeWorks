package org.example.day1.task1;

public class Book {
    String title;

    static {
        System.out.println("Book class loaded.");
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
