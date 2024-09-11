package com.mtjk.patterns.behavioral.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setText("State #1: Hello");
        caretaker.addMemento(textEditor.saveToMemento());

        textEditor.setText("State #2: Hello, World");
        caretaker.addMemento(textEditor.saveToMemento());

        textEditor.setText("State #3: Hello, World!!!");
        System.out.println("Current Text: " + textEditor.getText());

        textEditor.restoreFromMemento(caretaker.getMemento(1));
        System.out.println("Restored to: " + textEditor.getText());

        textEditor.restoreFromMemento(caretaker.getMemento(0));
        System.out.println("Restored to: " + textEditor.getText());
    }
}
