package com.mtjk.patterns.behavioral.visitor;

public interface Visitor {
    void visit(Book book);

    void visit(Magazine magazine);
}
