package org.example;

import org.example.command.*;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(BurgerType.CLASSIC,"garlic");
        Cashier cashier = new Cashier();
        Chef chef = new Chef();
        Command command = new CookBurger(chef);
        cashier.setCommand(command);
        cashier.takeOrder(order);



    }
}