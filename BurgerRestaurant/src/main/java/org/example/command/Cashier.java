package org.example.command;

import java.util.concurrent.ConcurrentMap;

/**Invoker*/
public class Cashier {

    private Command command;

    private Order order;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void takeOrder(Order order){
        System.out.printf("Order for %s BURGER is placed!\n",order.getBurgerType());
        this.command.execute();
    }
}
