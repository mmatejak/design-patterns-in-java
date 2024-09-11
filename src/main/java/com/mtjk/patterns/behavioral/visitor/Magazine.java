package com.mtjk.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class Magazine implements Element {
    private String title;
    private BigDecimal price;

    public Magazine(String title, BigDecimal price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
