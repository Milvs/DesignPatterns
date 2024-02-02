package org.example.receivers;
/**
 * Receiver:
 * -> put the business logic here
 * **/
public class Light {

    private Boolean switchedOn;

    public void turnOn(){
        System.out.print("lights are switched on!\n");
        this.switchedOn = true;
    }

    public void turnOff(){
        System.out.print("lights are switched off!\n");
        this.switchedOn = false;
    }
}
