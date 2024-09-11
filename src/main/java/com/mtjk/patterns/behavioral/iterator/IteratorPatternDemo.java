package com.mtjk.patterns.behavioral.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook("Effective Java", "Joshua Bloch");
        bookCollection.addBook("Clean Code", "Robert C. Martin");
        bookCollection.addBook("Design Patterns", "Erich Gamma");
        bookCollection.addBook("Java Concurrency in Practice", "Brian Goetz");

        Iterator bookIterator = bookCollection.createIterator();

        System.out.println("Iterating over book collection:");
        while (bookIterator.hasNext()) {
            Book book = (Book) bookIterator.next();
            System.out.println(book);
        }
    }
}
