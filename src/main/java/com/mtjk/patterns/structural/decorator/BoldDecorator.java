package com.mtjk.patterns.structural.decorator;

public class BoldDecorator extends TextDecorator {

    public BoldDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<b>" + decoratedText.getContent() + "</b>";
    }
}
