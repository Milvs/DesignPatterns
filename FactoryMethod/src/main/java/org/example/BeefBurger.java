package org.example;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Beef burger is ready!");
    }
}
