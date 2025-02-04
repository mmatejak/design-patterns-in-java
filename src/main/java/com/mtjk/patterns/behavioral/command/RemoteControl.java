package com.mtjk.patterns.behavioral.command;

import lombok.Setter;

@Setter
public class RemoteControl {
    private Command command;

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }
}
