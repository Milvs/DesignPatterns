package org.example.command;

public class CookBurger  implements Command{
    private Chef chef;


    public CookBurger(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute(Order order) {
        this.chef.prepareBurger(order);

    }

}
