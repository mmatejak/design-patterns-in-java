package com.mtjk.patterns.structural.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testAdapter() {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);

        adapter.request();

        String expectedOutput = "Specific request from Adaptee\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
