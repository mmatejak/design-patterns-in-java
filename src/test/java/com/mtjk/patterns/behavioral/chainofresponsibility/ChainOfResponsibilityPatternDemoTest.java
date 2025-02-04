package com.mtjk.patterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChainOfResponsibilityPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testChainOfResponsibility() {
        ChainOfResponsibilityPatternDemo.main(new String[]{});

        String expectedOutput = """
                Standard Console::Logger: This is an information.
                File::Logger: This is a debug level information.
                Standard Console::Logger: This is a debug level information.
                Error Console::Logger: This is an error information.
                File::Logger: This is an error information.
                Standard Console::Logger: This is an error information.
                """;

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
