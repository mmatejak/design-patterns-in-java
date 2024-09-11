package com.mtjk.patterns.creative.abstractfactory;

public class LightThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering button in light theme.");
    }
}
