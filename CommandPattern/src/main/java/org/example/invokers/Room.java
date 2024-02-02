package org.example.invokers;

import org.example.commands.Command;

public interface Room {

    void setCommand(Command command);

    void executeCommand();

}
