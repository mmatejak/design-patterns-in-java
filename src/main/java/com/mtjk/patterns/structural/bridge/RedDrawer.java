package com.mtjk.patterns.structural.bridge;

public class RedDrawer implements Color {

    @Override
    public void applyColor() {
        System.out.println("Red color.");
    }
}
