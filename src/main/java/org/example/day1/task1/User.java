package org.example.day1.task1;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Book> books = new ArrayList<>();

    static {
        System.out.println("User class loaded.");
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Book readBook() {
        if (!books.isEmpty()) {
            System.out.println(this.name + " reading book: " + books.get(0).getTitle());
            return books.remove(0);
        }
        System.out.println("User " + this.name + " dont have books.");
        return null;
    }

    public Book readBook(Book book) {
        System.out.println(this.name +
                "  is reading a book that he received through the parameters: " +
                book.getTitle());
        return book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
