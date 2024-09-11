package com.mtjk.patterns.creative.abstractfactory;

public class DarkThemeFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkThemeTextField();
    }
}
