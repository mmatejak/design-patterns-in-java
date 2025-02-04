package com.mtjk.patterns.behavioral.iterator;

public record Book(String title, String author) {

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}
