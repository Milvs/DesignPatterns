package org.example.decorator;

import org.example.Product;


public class BurgerDecorator implements Product {
    private Product burger;
    public BurgerDecorator(Product burger) {
        super();
        this.burger=burger;

    }
    public BurgerDecorator() {
        super();
    }

    @Override
    public void addSauce() {
        this.burger.addSauce();

    }
}
