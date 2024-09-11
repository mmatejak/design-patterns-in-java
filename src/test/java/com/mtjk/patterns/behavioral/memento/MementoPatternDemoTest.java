package com.mtjk.patterns.behavioral.memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMementoPattern() {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setText("State #1: Hello");
        caretaker.addMemento(textEditor.saveToMemento());

        textEditor.setText("State #2: Hello, World");
        caretaker.addMemento(textEditor.saveToMemento());

        textEditor.setText("State #3: Hello, World!!!");
        System.out.println("Current Text: " + textEditor.getText());

        textEditor.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored to: " + textEditor.getText());

        textEditor.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Restored to: " + textEditor.getText());

        String expectedOutput = "Current Text: State #3: Hello, World!!!\n" +
                "Restored to: State #2: Hello, World\n" +
                "Restored to: State #1: Hello\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
