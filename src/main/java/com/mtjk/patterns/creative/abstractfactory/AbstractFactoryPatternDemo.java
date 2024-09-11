package com.mtjk.patterns.creative.abstractfactory;

public class AbstractFactoryPatternDemo {
    private final Button button;
    private final TextField textField;

    public AbstractFactoryPatternDemo(GUIFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
    }

    public static void main(String[] args) {
        GUIFactory lightFactory = new LightThemeFactory();
        AbstractFactoryPatternDemo lightThemeDemo = new AbstractFactoryPatternDemo(lightFactory);
        System.out.println("Light Theme UI:");
        lightThemeDemo.renderUI();

        GUIFactory darkFactory = new DarkThemeFactory();
        AbstractFactoryPatternDemo darkThemeDemo = new AbstractFactoryPatternDemo(darkFactory);
        System.out.println("\nDark Theme UI:");
        darkThemeDemo.renderUI();
    }

    public void renderUI() {
        button.render();
        textField.render();
    }
}
