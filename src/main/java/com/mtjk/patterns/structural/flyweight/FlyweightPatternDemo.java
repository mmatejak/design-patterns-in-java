package com.mtjk.patterns.structural.flyweight;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        ShapeFactory.getCircle("5").draw("Red");
        ShapeFactory.getCircle("10").draw("Green");
        ShapeFactory.getCircle("5").draw("Blue");
        ShapeFactory.getCircle("10").draw("Yellow");
    }
}
