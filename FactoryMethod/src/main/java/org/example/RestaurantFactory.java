package org.example;

public abstract class RestaurantFactory{

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;

    }

    protected abstract Burger createBurger();

}
