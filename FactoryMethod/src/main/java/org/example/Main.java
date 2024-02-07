package org.example;

public class Main {
    public static void main(String[] args) {
        RestaurantFactory veggieRestaurant = new VeggieRestaurant();
        veggieRestaurant.orderBurger();

        System.out.println("---------------");
        RestaurantFactory beefRestaurant = new BeefRestaurant();
        beefRestaurant.orderBurger();
    }
}