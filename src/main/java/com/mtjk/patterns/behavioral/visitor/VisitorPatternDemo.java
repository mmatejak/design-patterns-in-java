package com.mtjk.patterns.behavioral.visitor;

import java.math.BigDecimal;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Element[] elements = {
                new Book("The Great Gatsby", BigDecimal.valueOf(10.99)),
                new Magazine("National Geographic", BigDecimal.valueOf(5.99)),
                new Book("1984", BigDecimal.valueOf(8.99)),
                new Magazine("Time", BigDecimal.valueOf(4.99))
        };

        ValueVisitor valueVisitor = new ValueVisitor();
        ReportVisitor reportVisitor = new ReportVisitor();

        for (Element element : elements) {
            element.accept(valueVisitor);
            element.accept(reportVisitor);
        }

        System.out.println("Total Value: $" + valueVisitor.getTotalValue());
        System.out.println("Report:");
        System.out.println(reportVisitor.getReport());
    }
}
