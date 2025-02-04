package com.mtjk.patterns.behavioral.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VisitorPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testValueVisitor() {
        Element[] elements = {
                new Book("The Great Gatsby", BigDecimal.valueOf(10.99)),
                new Magazine("National Geographic", BigDecimal.valueOf(5.99)),
                new Book("1984", BigDecimal.valueOf(8.99)),
                new Magazine("Time", BigDecimal.valueOf(4.99))
        };

        ValueVisitor valueVisitor = new ValueVisitor();

        for (Element element : elements) {
            element.accept(valueVisitor);
        }

        assertEquals(BigDecimal.valueOf(30.96), valueVisitor.getTotalValue());
    }

    @Test
    void testReportVisitor() {
        Element[] elements = {
                new Book("The Great Gatsby", BigDecimal.valueOf(10.99)),
                new Magazine("National Geographic", BigDecimal.valueOf(5.99)),
                new Book("1984", BigDecimal.valueOf(8.99)),
                new Magazine("Time", BigDecimal.valueOf(4.99))
        };

        ReportVisitor reportVisitor = new ReportVisitor();

        for (Element element : elements) {
            element.accept(reportVisitor);
        }

        String expectedReport = """
                Book: The Great Gatsby - $10.99
                Magazine: National Geographic - $5.99
                Book: 1984 - $8.99
                Magazine: Time - $4.99
                """;

        assertEquals(expectedReport, reportVisitor.getReport());
    }
}
