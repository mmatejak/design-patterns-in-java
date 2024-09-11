package com.mtjk.patterns.structural.decorator;

public abstract class TextDecorator implements Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    public abstract String getContent();
}
