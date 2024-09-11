package com.mtjk.patterns.structural.bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedDrawer());
        Shape blueSquare = new Square(new BlueDrawer());

        redCircle.draw();
        blueSquare.draw();
    }
}
