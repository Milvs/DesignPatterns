package org.example.singleton;

import org.example.command.Command;

import java.util.concurrent.ConcurrentMap;

public class Restaurant {

    private Command command;

    private static Restaurant restaurant;

    private Restaurant(){}

    public static Restaurant getRestaurantInstance(){
        if (restaurant==null){
            restaurant = new Restaurant();
        }
        return restaurant;
    }

}
