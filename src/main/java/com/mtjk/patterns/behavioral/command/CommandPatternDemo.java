package com.mtjk.patterns.behavioral.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light();
        TV livingRoomTV = new TV();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command tvOn = new TVOnCommand(livingRoomTV);
        Command tvOff = new TVOffCommand(livingRoomTV);

        // Włączamy światło
        remote.setCommand(lightOn);
        remote.pressButton();
        remote.pressUndo();

        // Wyłączamy światło
        remote.setCommand(lightOff);
        remote.pressButton();
        remote.pressUndo();

        // Włączamy TV
        remote.setCommand(tvOn);
        remote.pressButton();
        remote.pressUndo();

        // Wyłączamy TV
        remote.setCommand(tvOff);
        remote.pressButton();
        remote.pressUndo();
    }
}
