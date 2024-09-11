package com.mtjk.patterns.structural.flyweight;

public class Circle implements Shape {
    private final String radius;  // Shared state

    public Circle(String radius) {
        this.radius = radius;
    }

    @Override
    public void draw(String color) {
        System.out.println("Circle with radius " + radius + " and color " + color);
    }
}
