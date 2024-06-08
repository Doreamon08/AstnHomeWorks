package org.example.day1.task1;

public class Main {
    public static void main(String[] args) {

        Book newBook = new Book("Head first: Java");
        System.out.println(newBook.getTitle());
        newBook.setTitle("Java for Dummies");
        System.out.println(newBook.getTitle());
        newBook.title = "Concurrency in Practice";
        System.out.println(newBook.getTitle());

        System.out.println("\n\n\n");

        Library library = new Library();
        User user = new User("Shon");
        user.readBook();
        user.addBook(library.getBook());
        user.readBook();
        user.readBook(newBook);
    }
}