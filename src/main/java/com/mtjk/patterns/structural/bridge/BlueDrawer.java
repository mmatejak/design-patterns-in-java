package com.mtjk.patterns.structural.bridge;

public class BlueDrawer implements Color {

    @Override
    public void applyColor() {
        System.out.println("Blue color.");
    }
}
