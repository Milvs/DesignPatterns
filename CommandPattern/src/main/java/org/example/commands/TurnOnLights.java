package org.example.commands;

import org.example.receivers.Light;

/**
 * ConcreteCommand:
 * -> it needs the receiver
 **/
public class TurnOnLights implements Command {
    private Light light;

    public TurnOnLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }
}
