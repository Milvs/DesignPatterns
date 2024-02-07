package org.example;

public class VeggieRestaurant extends RestaurantFactory{
    @Override
    protected Burger createBurger() {
        System.out.println("Creating veggie burger...");
        return new VeggieBurger();
    }
}
