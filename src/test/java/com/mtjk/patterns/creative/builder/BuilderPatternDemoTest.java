package com.mtjk.patterns.creative.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderPatternDemoTest {

    @Test
    void testGamingComputerBuilder() {
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .build();

        String expectedOutput = "Computer [CPU=Intel i9, RAM=32GB, Storage=1000GB]";
        assertEquals(expectedOutput, gamingComputer.toString());
    }

    @Test
    void testOfficeComputerBuilder() {
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM(16)
                .setStorage(512)
                .build();

        String expectedOutput = "Computer [CPU=Intel i5, RAM=16GB, Storage=512GB]";
        assertEquals(expectedOutput, officeComputer.toString());
    }
}
