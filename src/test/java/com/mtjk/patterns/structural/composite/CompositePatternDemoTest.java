package com.mtjk.patterns.structural.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositePatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testComposite() {
        Component file1 = new Leaf("File1.txt");
        Component file2 = new Leaf("File2.txt");
        Component file3 = new Leaf("File3.txt");

        Composite folder1 = new Composite("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Composite folder2 = new Composite("Folder2");
        folder2.add(file3);

        Composite rootFolder = new Composite("RootFolder");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        rootFolder.showDetails();

        String expectedOutput = "Folder: RootFolder\n" +
                "Folder: Folder1\n" +
                "File: File1.txt\n" +
                "File: File2.txt\n" +
                "Folder: Folder2\n" +
                "File: File3.txt\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
