package org.example;

public class BeefRestaurant extends RestaurantFactory{
    @Override
    protected Burger createBurger() {
        System.out.println("Creating beef burger...");
        return new BeefBurger();
    }
}
