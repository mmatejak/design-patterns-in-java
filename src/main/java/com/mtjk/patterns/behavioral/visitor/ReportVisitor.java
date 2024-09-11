package com.mtjk.patterns.behavioral.visitor;

public class ReportVisitor implements Visitor {
    private StringBuilder report = new StringBuilder();

    @Override
    public void visit(Book book) {
        report.append("Book: ").append(book.getTitle()).append(" - $").append(book.getPrice()).append("\n");
    }

    @Override
    public void visit(Magazine magazine) {
        report.append("Magazine: ").append(magazine.getTitle()).append(" - $").append(magazine.getPrice()).append("\n");
    }

    public String getReport() {
        return report.toString();
    }
}
