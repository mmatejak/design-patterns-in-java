package com.mtjk.patterns.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TextEditor {
    private String text;

    public Memento saveToMemento() {
        return new Memento(text);
    }

    public void restoreFromMemento(Memento memento) {
        text = memento.state();
    }
}
