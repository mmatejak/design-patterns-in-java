package com.mtjk.patterns.behavioral.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IteratorPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testIteratorPattern() {
        IteratorPatternDemo.main(new String[]{});

        String expectedOutput = """
                Iterating over book collection:
                Book [Title: Effective Java, Author: Joshua Bloch]
                Book [Title: Clean Code, Author: Robert C. Martin]
                Book [Title: Design Patterns, Author: Erich Gamma]
                Book [Title: Java Concurrency in Practice, Author: Brian Goetz]
                """;

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
