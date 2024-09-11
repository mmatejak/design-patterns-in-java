package com.mtjk.patterns.structural.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorPatternDemoTest {

    private Text simpleText;

    @BeforeEach
    void setUp() {
        simpleText = new SimpleText("Hello, World!");
    }

    @Test
    void testBoldDecorator() {
        Text boldText = new BoldDecorator(simpleText);
        assertEquals("<b>Hello, World!</b>", boldText.getContent());
    }

    @Test
    void testItalicDecorator() {
        Text italicText = new ItalicDecorator(simpleText);
        assertEquals("<i>Hello, World!</i>", italicText.getContent());
    }

    @Test
    void testItalicBoldDecorator() {
        Text boldText = new BoldDecorator(simpleText);
        Text italicBoldText = new ItalicDecorator(boldText);
        assertEquals("<i><b>Hello, World!</b></i>", italicBoldText.getContent());
    }
}
