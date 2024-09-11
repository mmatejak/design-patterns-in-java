package com.mtjk.patterns.structural.decorator;

public class ItalicDecorator extends TextDecorator {

    public ItalicDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getContent() {
        return "<i>" + decoratedText.getContent() + "</i>";
    }
}
