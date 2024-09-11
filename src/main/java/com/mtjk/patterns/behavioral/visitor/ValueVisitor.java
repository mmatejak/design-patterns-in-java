package com.mtjk.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class ValueVisitor implements Visitor {
    private BigDecimal totalValue = BigDecimal.ZERO;

    @Override
    public void visit(Book book) {
        totalValue = totalValue.add(book.getPrice());
    }

    @Override
    public void visit(Magazine magazine) {
        totalValue = totalValue.add(magazine.getPrice());
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }
}
