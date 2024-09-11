package com.mtjk.patterns.creative.abstractfactory;

public class DarkThemeButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering button in dark theme.");
    }
}
