package com.mtjk.patterns.structural.decorator;

public class SimpleText implements Text {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
