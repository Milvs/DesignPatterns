package org.example.decorator;

import org.example.Product;

public class KetchupDecorator extends BurgerDecorator {

    private String sauce;

    public KetchupDecorator(Product burger, String sauce) {
        super(burger);
        this.sauce = sauce;
    }

    @Override
    public void addSauce() {
        System.out.println("Adding ketchup!");
    }
}
