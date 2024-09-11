package com.mtjk.patterns.structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgePatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testRedCircle() {
        Shape redCircle = new Circle(new RedDrawer());
        redCircle.draw();

        String expectedOutput = "Drawing Circle with Red color.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }

    @Test
    void testBlueSquare() {
        Shape blueSquare = new Square(new BlueDrawer());
        blueSquare.draw();

        String expectedOutput = "Drawing Square with Blue color.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
