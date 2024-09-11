package com.mtjk.patterns.creative.abstractfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractFactoryPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testLightThemeFactory() {
        GUIFactory lightFactory = new LightThemeFactory();
        AbstractFactoryPatternDemo lightThemeDemo = new AbstractFactoryPatternDemo(lightFactory);
        lightThemeDemo.renderUI();

        String expectedOutput = "Rendering button in light theme.\n" +
                "Rendering text field in light theme.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }

    @Test
    void testDarkThemeFactory() {
        GUIFactory darkFactory = new DarkThemeFactory();
        AbstractFactoryPatternDemo darkThemeDemo = new AbstractFactoryPatternDemo(darkFactory);
        darkThemeDemo.renderUI();

        String expectedOutput = "Rendering button in dark theme.\n" +
                "Rendering text field in dark theme.\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
