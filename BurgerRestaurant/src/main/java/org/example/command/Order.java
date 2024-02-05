package org.example.command;

import org.example.BurgerType;

public class Order {
    private BurgerType burgerType;
    private String sauce;


    public Order(BurgerType burgerType, String sauce) {
        this.burgerType = burgerType;
        this.sauce=sauce;
    }

    public BurgerType getBurgerType() {
        return burgerType;
    }

    public String getSauce() {
        return sauce;
    }
}
