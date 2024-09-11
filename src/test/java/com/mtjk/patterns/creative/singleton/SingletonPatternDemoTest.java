package com.mtjk.patterns.creative.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonPatternDemoTest {

    @Test
    void testSingletonInstance() {
        // Pobranie dwóch instancji Singleton
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Sprawdzenie, czy obie instancje są takie same
        assertSame(instance1, instance2, "Singleton instances should be the same");
    }
}
