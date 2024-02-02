package org.example.command;

import org.example.BurgerType;

public class Order {
    private BurgerType burgerType;

    public Order(BurgerType burgerType) {
        this.burgerType = burgerType;
    }

    public BurgerType getBurgerType() {
        return burgerType;
    }
}
