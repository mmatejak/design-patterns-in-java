package com.mtjk.patterns.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ObserverPatternDemoTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Przechwytywanie wyjścia z konsoli
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testObserverPattern() {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");
        Observer observer3 = new ConcreteObserver("Observer 3");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);

        subject.setState("State 1");
        subject.setState("State 2");

        String expectedOutput = "Observer 1 received update: State 1\n" +
                "Observer 2 received update: State 1\n" +
                "Observer 3 received update: State 1\n" +
                "Observer 1 received update: State 2\n" +
                "Observer 2 received update: State 2\n" +
                "Observer 3 received update: State 2\n";

        // Normalize line separators
        String normalizedActualOutput = outputStream.toString().replace("\r\n", "\n");
        String normalizedExpectedOutput = expectedOutput.replace("\r\n", "\n");

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
    }
}
