package com.mtjk.patterns.behavioral.memento;

public class TextEditor {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Memento saveToMemento() {
        return new Memento(text);
    }

    public void restoreFromMemento(Memento memento) {
        text = memento.getState();
    }
}
