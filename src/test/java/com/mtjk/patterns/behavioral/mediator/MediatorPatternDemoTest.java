package com.mtjk.patterns.behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediatorPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMediatorPattern() {
        Mediator chatMediator = new ChatMediator();

        User user1 = new ConcreteUser(chatMediator, "Alice");
        User user2 = new ConcreteUser(chatMediator, "Bob");
        User user3 = new ConcreteUser(chatMediator, "Charlie");
        User user4 = new ConcreteUser(chatMediator, "Diana");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.send("Hello everyone!");
        user2.send("Hi Alice!");

        String expectedOutput = "Alice sends: Hello everyone!\n" +
                "Bob receives: Hello everyone!\n" +
                "Charlie receives: Hello everyone!\n" +
                "Diana receives: Hello everyone!\n" +
                "Bob sends: Hi Alice!\n" +
                "Alice receives: Hi Alice!\n" +
                "Charlie receives: Hi Alice!\n" +
                "Diana receives: Hi Alice!\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
