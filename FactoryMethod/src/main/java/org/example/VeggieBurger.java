package org.example;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Veggie burger is ready!");
    }
}
