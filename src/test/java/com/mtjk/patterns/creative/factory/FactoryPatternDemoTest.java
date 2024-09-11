package com.mtjk.patterns.creative.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testPDFDocumentFactory() {
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();

        String expectedOutput = "Opening PDF document.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }

    @Test
    void testWordDocumentFactory() {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();

        String expectedOutput = "Opening Word document.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
