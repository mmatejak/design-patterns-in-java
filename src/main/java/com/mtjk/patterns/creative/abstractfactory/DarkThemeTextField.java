package com.mtjk.patterns.creative.abstractfactory;

public class DarkThemeTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering text field in dark theme.");
    }
}
