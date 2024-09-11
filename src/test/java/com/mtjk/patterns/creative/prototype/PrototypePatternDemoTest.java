package com.mtjk.patterns.creative.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrototypePatternDemoTest {

    @Test
    void testCarClone() {
        Vehicle car = new Car();
        Vehicle clonedCar = car.clone();

        assertEquals("Car", car.getType());
        assertEquals("Car", clonedCar.getType());
    }

    @Test
    void testMotorcycleClone() {
        Vehicle motorcycle = new Motorcycle();
        Vehicle clonedMotorcycle = motorcycle.clone();

        assertEquals("Motorcycle", motorcycle.getType());
        assertEquals("Motorcycle", clonedMotorcycle.getType());
    }
}
