package com.mtjk.patterns.structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Hello, World!");

        Text boldText = new BoldDecorator(simpleText);
        Text italicBoldText = new ItalicDecorator(boldText);

        System.out.println("Simple Text: " + simpleText.getContent());
        System.out.println("Bold Text: " + boldText.getContent());
        System.out.println("Italic and Bold Text: " + italicBoldText.getContent());
    }
}
