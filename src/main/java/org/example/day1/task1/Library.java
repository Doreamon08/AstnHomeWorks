package org.example.day1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Library {
    private List<Book> books = new ArrayList<Book>();

    static {
        System.out.println("Library class loaded.");
    }

    {
        books.add(new Book("Think in Java"));
        books.add(new Book("Clean Code"));
        books.add(new Book("Grokking Algorithms"));
        System.out.println("Books are added to the library");
    }

    public Library() {
        System.out.println("The library is being initialized");
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public Book getBook() {
        if (!books.isEmpty())
            return books.remove(0);
        System.out.println("There are no books in the library");
        return null;
    }

    public void returnBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
