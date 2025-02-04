package com.mtjk.patterns.structural.flyweight;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlyweightPatternDemoTest {

    @Test
    void testFlyweight() {
        // Mocking System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Shape circle1 = ShapeFactory.getCircle("5");
        circle1.draw("Red");
        Shape circle2 = ShapeFactory.getCircle("10");
        circle2.draw("Green");
        Shape circle3 = ShapeFactory.getCircle("5");
        circle3.draw("Blue");
        Shape circle4 = ShapeFactory.getCircle("10");
        circle4.draw("Yellow");

        // Restore original System.out
        System.setOut(originalOut);

        String expectedOutput = """
                Creating circle with radius 5
                Circle with radius 5 and color Red
                Creating circle with radius 10
                Circle with radius 10 and color Green
                Circle with radius 5 and color Blue
                Circle with radius 10 and color Yellow
                """;

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
