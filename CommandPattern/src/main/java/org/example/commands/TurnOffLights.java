package org.example.commands;

import org.example.receivers.Light;

/**
 * ConcreteCommand:
 * -> it needs receiver
 * ->
 **/
public class TurnOffLights implements Command {

    private Light light;

    public TurnOffLights(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }
}
