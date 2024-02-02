package org.example.invokers;

import org.example.commands.Command;

/**
 * Invoker:
 * -> initiate the request
 * -> needs the exact command
 * -> needs to invoke the execute method from the command -> then the command sends it to the receiver - aka Light
 * **/
public class Bathroom implements Room{

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        System.out.print("Bathroom ");
        this.command.execute();
    }
}
