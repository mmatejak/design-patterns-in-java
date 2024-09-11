package com.mtjk.patterns.behavioral.template;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplatePatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPDFDocumentProcessor() {
        AbstractDocumentProcessor processor = new PDFDocumentProcessor();
        processor.processDocument();

        String expectedOutput = "Loading PDF document.\n" +
                "Rendering PDF document.\n" +
                "Saving PDF document.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }

    @Test
    void testWordDocumentProcessor() {
        AbstractDocumentProcessor processor = new WordDocumentProcessor();
        processor.processDocument();

        String expectedOutput = "Loading Word document.\n" +
                "Rendering Word document.\n" +
                "Saving Word document.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
