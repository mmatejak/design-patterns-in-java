package com.mtjk.patterns.behavioral.iterator;

public class BookCollectionIterator implements Iterable<Book> {
    private BookCollection bookCollection;

    public BookCollectionIterator(BookCollection bookCollection) {
        this.bookCollection = bookCollection;
    }

    @Override
    public java.util.Iterator<Book> iterator() {
        return new java.util.Iterator<Book>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bookCollection.getBooks().length && bookCollection.getBooks()[currentIndex] != null;
            }

            @Override
            public Book next() {
                return bookCollection.getBooks()[currentIndex++];
            }
        };
    }
}
