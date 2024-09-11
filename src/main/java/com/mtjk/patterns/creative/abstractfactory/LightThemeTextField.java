package com.mtjk.patterns.creative.abstractfactory;

public class LightThemeTextField implements TextField {
    @Override
    public void render() {
        System.out.println("Rendering text field in light theme.");
    }
}
