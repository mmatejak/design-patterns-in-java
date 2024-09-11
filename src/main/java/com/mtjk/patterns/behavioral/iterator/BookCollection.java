package com.mtjk.patterns.behavioral.iterator;

import lombok.Getter;

@Getter
public class BookCollection {
    private static final int MAX_BOOKS = 5;
    private int numberOfBooks = 0;
    private Book[] books;

    public BookCollection() {
        books = new Book[MAX_BOOKS];
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        if (numberOfBooks >= MAX_BOOKS) {
            System.out.println("Library is full, can't add more books.");
        } else {
            books[numberOfBooks] = book;
            numberOfBooks++;
        }
    }

    public Iterator createIterator() {
        return new BookIterator(books);
    }
}
