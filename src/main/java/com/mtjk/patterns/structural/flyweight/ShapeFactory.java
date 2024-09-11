package com.mtjk.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle(String radius) {
        Shape circle = shapeMap.get(radius);

        if (circle == null) {
            circle = new Circle(radius);
            shapeMap.put(radius, circle);
            System.out.println("Creating circle with radius " + radius);
        }
        return circle;
    }
}
