package org.example;

import org.example.commands.Command;
import org.example.commands.TurnOffLights;
import org.example.commands.TurnOnLights;
import org.example.invokers.Bathroom;
import org.example.invokers.Kitchen;
import org.example.invokers.Room;
import org.example.receivers.Light;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern");
        Light kitchenLight = new Light();
        Light bathroomLight = new Light();

        Room bathroom = new Bathroom();
        Room kitchen = new Kitchen();

        Command command = new TurnOnLights(kitchenLight);
        Command command1 = new TurnOnLights(bathroomLight);
        Command command2 = new TurnOffLights(bathroomLight);

        bathroom.setCommand(command1);
        bathroom.executeCommand();

        kitchen.setCommand(command);
        kitchen.executeCommand();

        bathroom.setCommand(command2);
        bathroom.executeCommand();
    }
}