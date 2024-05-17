package org.example.day1.task1;

import java.util.List;

public class User {
    private String name;
    private List<Book> books;

    void readBook() {
        System.out.println(this.name + " reading book.");
    }
}
