package com.mtjk.patterns.creative.abstractfactory;

public class LightThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new LightThemeTextField();
    }
}
